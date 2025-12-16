package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapClient;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoReq;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37829c {

    /* renamed from: a, reason: collision with root package name */
    final IapClient f365552a;

    /* renamed from: b, reason: collision with root package name */
    final Context f365553b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC10794c f365554c;

    /* renamed from: d, reason: collision with root package name */
    Set<d> f365555d;

    /* renamed from: com.my.tracker.obfuscated.c$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IapClient f365556a;

        /* renamed from: b, reason: collision with root package name */
        final Context f365557b;

        public b(IapClient iapClient, Context context) {
            this.f365556a = iapClient;
            this.f365557b = context;
        }

        public C37829c a(InterfaceC10794c interfaceC10794c) {
            return new C37829c(this.f365556a, interfaceC10794c, this.f365557b);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.c$c, reason: collision with other inner class name */
    public interface InterfaceC10794c {
        void b(List<C37831e> list);

        void c(List<C37831e> list);
    }

    /* renamed from: com.my.tracker.obfuscated.c$d */
    public final class d implements com.huawei.hmf.tasks.i<OwnedPurchasesResult> {

        /* renamed from: a, reason: collision with root package name */
        final int f365558a;

        /* renamed from: b, reason: collision with root package name */
        final int f365559b;

        /* renamed from: c, reason: collision with root package name */
        final List<String> f365560c = Collections.synchronizedList(new ArrayList());

        /* renamed from: d, reason: collision with root package name */
        final List<String> f365561d = Collections.synchronizedList(new ArrayList());

        /* renamed from: e, reason: collision with root package name */
        String f365562e;

        public d(int i12, int i13) {
            this.f365558a = i12;
            this.f365559b = i13;
            e2.a("OwnedPurchaseLoader: loader created");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(OwnedPurchasesResult ownedPurchasesResult) {
            this.f365560c.addAll(ownedPurchasesResult.getInAppPurchaseDataList());
            this.f365561d.addAll(ownedPurchasesResult.getInAppSignature());
            String continuationToken = ownedPurchasesResult.getContinuationToken();
            if (!TextUtils.isEmpty(continuationToken)) {
                e2.a("OwnedPurchaseLoader: loading more obtainOwnedPurchasesRecord by continuationToken");
                b(continuationToken);
                return;
            }
            if (this.f365560c.isEmpty()) {
                e2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Purchases is null. source is " + this.f365559b + " priceType is " + this.f365558a);
                C37829c.this.b(this);
                return;
            }
            if (!this.f365561d.isEmpty()) {
                this.f365562e = ownedPurchasesResult.getSignatureAlgorithm();
                C37829c.this.a(this);
                return;
            }
            e2.a("OwnedPurchaseLoader: failure load obtain owned purchases. Signatures is null. source is " + this.f365559b + " priceType is " + this.f365558a);
            C37829c.this.b(this);
        }

        @Override // com.huawei.hmf.tasks.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
            C37835i.a(new H(0, this, ownedPurchasesResult));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            e2.a("AppGalleryHelper: onLoadingPurchasesFailure ", exc);
            C37829c.this.b(this);
        }

        public void b(String str) {
            C37835i.f(new H(1, this, str));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            Task taskObtainOwnedPurchaseRecord;
            e2.a("OwnedPurchaseLoader: start loadPurchases");
            OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
            ownedPurchasesReq.setPriceType(this.f365558a);
            ownedPurchasesReq.setContinuationToken(str);
            int i12 = this.f365559b;
            if (i12 == 2) {
                taskObtainOwnedPurchaseRecord = C37829c.this.f365552a.obtainOwnedPurchases(ownedPurchasesReq);
            } else {
                if (i12 != 3) {
                    e2.a("OwnedPurchaseLoader: invalid source to load purchases");
                    C37829c.this.b(this);
                    return;
                }
                taskObtainOwnedPurchaseRecord = C37829c.this.f365552a.obtainOwnedPurchaseRecord(ownedPurchasesReq);
            }
            taskObtainOwnedPurchaseRecord.a(new G(this));
            taskObtainOwnedPurchaseRecord.b(this);
        }
    }

    private C37829c(IapClient iapClient, InterfaceC10794c interfaceC10794c, Context context) {
        this.f365552a = iapClient;
        this.f365554c = interfaceC10794c;
        this.f365553b = context;
        e2.a("AppGalleryHelper AppGalleryHelper created");
    }

    public static b a(Context context) {
        try {
            return new b(Iap.getIapClient(context), context);
        } catch (Throwable th2) {
            e2.b("AppGalleryHelper: creating AppGalleryHelperBuilder failed", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Intent intent) {
        PurchaseResultInfo purchaseResultInfoFromIntent = this.f365552a.parsePurchaseResultInfoFromIntent(intent);
        int returnCode = purchaseResultInfoFromIntent.getReturnCode();
        if (returnCode == 0) {
            this.f365554c.b(Collections.singletonList(C37831e.a(purchaseResultInfoFromIntent.getInAppPurchaseData(), purchaseResultInfoFromIntent.getInAppDataSignature(), purchaseResultInfoFromIntent.getSignatureAlgorithm(), 1, c2.a())));
        } else {
            e2.b("AppGalleryHelper error: can not getting PurchaseResultInfo. resultCode " + returnCode);
        }
    }

    public static ArrayList<C37831e> a(List<String> list, List<String> list2, String str, int i12) {
        ArrayList<C37831e> arrayList = new ArrayList<>();
        long jA2 = c2.a();
        for (int i13 = 0; i13 < list.size(); i13++) {
            C37831e c37831eA = C37831e.a(list.get(i13), list2.get(i13), str, i12, jA2);
            if (c37831eA == null) {
                e2.a("AppGalleryHelper: failed to create AppGalleryRawPurchase");
            } else {
                arrayList.add(c37831eA);
            }
        }
        return arrayList;
    }

    public void b(d dVar) {
        Set<d> set = this.f365555d;
        if (set == null) {
            e2.a("AppGalleryHelper: can't remove OwnedPurchaseLoader, purchaseLoaders list is null");
            return;
        }
        set.remove(dVar);
        if (set.isEmpty()) {
            this.f365555d = null;
        }
    }

    public static JSONObject a(Object obj) {
        e2.a("AppGalleryHelper: start parseProductInfoToJson");
        try {
            ProductInfo productInfo = (ProductInfo) obj;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("productId", productInfo.getProductId());
            jSONObject.put("productName", productInfo.getProductName());
            jSONObject.put("productDesc", productInfo.getProductDesc());
            jSONObject.put("currency", productInfo.getCurrency());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("status", productInfo.getStatus());
            return jSONObject;
        } catch (NoClassDefFoundError e12) {
            e2.b("AppGalleryHelper: ", e12);
            return null;
        } catch (Throwable th2) {
            e2.b("AppGalleryHelper: ", th2);
            return null;
        }
    }

    public JSONObject a(List<JSONObject> list, String str) {
        String str2;
        if (str == null) {
            str2 = "AppGalleryHelper: can't get product by id, id is null";
        } else {
            if (list != null) {
                for (JSONObject jSONObject : list) {
                    try {
                    } catch (Throwable th2) {
                        e2.a("AppGalleryHelper: error while reading product_id", th2);
                    }
                    if (jSONObject.getString("productId").equals(str)) {
                        return jSONObject;
                    }
                }
                return null;
            }
            str2 = "AppGalleryHelper: can't get product by id, productInfoListJson is null";
        }
        e2.a(str2);
        return null;
    }

    public void a() {
        HashSet hashSet = new HashSet();
        hashSet.add(new d(0, 2));
        hashSet.add(new d(1, 2));
        hashSet.add(new d(2, 2));
        hashSet.add(new d(0, 3));
        hashSet.add(new d(2, 3));
        this.f365555d = Collections.synchronizedSet(hashSet);
        e2.a("AppGalleryHelper: purchase loaders created");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b((String) null);
        }
    }

    public void a(Intent intent) {
        e2.a("AppGalleryHelper: starting getAppGalleryPurchaseByIntent");
        C37835i.f(new H(4, this, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoReq productInfoReq, final List list) {
        Task taskObtainProductInfo = this.f365552a.obtainProductInfo(productInfoReq);
        taskObtainProductInfo.a(new E(this, list));
        taskObtainProductInfo.b(new com.huawei.hmf.tasks.i() { // from class: com.my.tracker.obfuscated.F
            @Override // com.huawei.hmf.tasks.i
            public final void onSuccess(Object obj) {
                this.f365279b.a(list, (ProductInfoResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ProductInfoResult productInfoResult, List list) {
        List productInfoList = productInfoResult.getProductInfoList();
        if (productInfoList == null) {
            e2.a("AppGalleryHelper: productInfoList is null, finish products loading");
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = productInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(a((ProductInfo) it.next()));
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C37831e c37831e = (C37831e) it2.next();
                c37831e.a(a(arrayList, c37831e.c()));
            }
        }
        this.f365554c.c(list);
    }

    public void a(d dVar) {
        this.f365554c.b(a(dVar.f365560c, dVar.f365561d, dVar.f365562e, dVar.f365559b));
        b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Exception exc, List list) {
        e2.a("AppGalleryHelper: error while loading products ", exc);
        this.f365554c.c(list);
    }

    public void a(List<C37831e> list) {
        e2.a("AppGalleryHelper: start loading all products");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C37831e c37831e : list) {
            try {
                int i12 = c37831e.e().getInt(MessageBody.Location.KIND);
                if (i12 == 0) {
                    arrayList.add(c37831e);
                } else if (i12 == 1) {
                    arrayList2.add(c37831e);
                } else if (i12 == 2) {
                    arrayList3.add(c37831e);
                }
            } catch (Throwable th2) {
                e2.b("AppGalleryHelper: can not getting price type ", th2);
            }
        }
        if (arrayList.size() > 0) {
            a(arrayList, 0);
        }
        if (arrayList2.size() > 0) {
            a(arrayList2, 1);
        }
        if (arrayList3.size() > 0) {
            a(arrayList3, 2);
        }
    }

    public void a(List<C37831e> list, int i12) {
        e2.a("AppGalleryHelper: start loading products by price");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator<C37831e> it = list.iterator();
        while (it.hasNext() && hashSet.size() < 200) {
            C37831e next = it.next();
            hashSet.add(next.c());
            arrayList.add(next);
            it.remove();
        }
        e2.a("AppGalleryHelper: product id's have been detected");
        while (it.hasNext()) {
            C37831e next2 = it.next();
            if (hashSet.contains(next2.c())) {
                arrayList.add(next2);
                it.remove();
            }
        }
        e2.a("AppGalleryHelper: products deduplication done");
        if (list.size() > 0) {
            e2.a("AppGalleryHelper: there are still unloaded products, we are loading more");
            a(list, i12);
        }
        ProductInfoReq productInfoReq = new ProductInfoReq();
        productInfoReq.setPriceType(i12);
        productInfoReq.setProductIds(new ArrayList(hashSet));
        C37835i.f(new D(this, productInfoReq, arrayList, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, ProductInfoResult productInfoResult) {
        C37835i.a(new D(this, productInfoResult, list, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, Exception exc) {
        C37835i.a(new D(this, exc, list, 3));
    }
}
