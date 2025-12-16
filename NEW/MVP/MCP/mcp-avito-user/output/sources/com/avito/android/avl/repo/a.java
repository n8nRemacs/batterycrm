package com.avito.android.avl.repo;

import Cl0.InterfaceC13319a;
import Mg.InterfaceC14486a;
import Y61.k;
import Y61.l;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.i;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.util.InterfaceC35950u;
import h31.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import zg.InterfaceC50560a;

/* compiled from: AvlRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avl/repo/a;", "LMg/a;", "a", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC14486a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f98263g = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC13319a> f98264a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC50560a f98265b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35950u f98266c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f98267d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashMap f98268e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinkedHashMap f98269f = new LinkedHashMap();

    /* compiled from: AvlRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/avl/repo/a$a;", "", "<init>", "()V", "", "SHORT_VIDEOS_INITIAL_REQUEST_OFFSET", "I", "SHORT_VIDEOS_REQUEST_LIMIT", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.avl.repo.a$a, reason: collision with other inner class name */
    public static final class C2948a {
        public /* synthetic */ C2948a(C42822w c42822w) {
            this();
        }

        public C2948a() {
        }
    }

    static {
        new C2948a(null);
    }

    public a(@k e<InterfaceC13319a> eVar, @k InterfaceC50560a interfaceC50560a, @k InterfaceC35950u interfaceC35950u) {
        this.f98264a = eVar;
        this.f98265b = interfaceC50560a;
        this.f98266c = interfaceC35950u;
    }

    public static ArrayList g(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object videoUrl = (com.avito.conveyor_item.a) obj;
            if (videoUrl instanceof BaseAvlVideoItem) {
                BaseAvlVideoItem baseAvlVideoItem = (BaseAvlVideoItem) videoUrl;
                Object itemId = baseAvlVideoItem.getItemId();
                videoUrl = itemId == null ? baseAvlVideoItem.getVideoUrl() : itemId;
            }
            if (hashSet.add(videoUrl)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:13|60)(2:14|15))(8:16|63|17|46|47|(1:53)(1:54)|55|(2:57|(1:59)(1:66))(1:65)))(1:21))(2:22|(2:24|(1:26)(1:27))(8:29|(1:32)|(1:35)|61|36|(1:38)(1:41)|42|(1:44)(6:45|46|47|(0)(0)|55|(0)(0))))|28|(1:32)|(1:35)|61|36|(0)(0)|42|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        r4 = r2;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        r0 = new java.lang.Throwable();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:36:0x00b4, B:38:0x00ba, B:42:0x00c5), top: B:61:0x00b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    @Override // Mg.InterfaceC14486a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.lang.String r17, @Y61.l java.lang.String r18, @Y61.l java.lang.String r19, @Y61.l java.lang.String r20, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avl.repo.a.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Mg.InterfaceC14486a
    @l
    public final Object b(@l String str, @k CommercialItem commercialItem, @k ContinuationImpl continuationImpl) {
        Z1 z12 = (Z1) this.f98267d.get(str);
        if (z12 != null) {
            List<com.avito.conveyor_item.a> list = ((Mg.c) z12.getValue()).f10986b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a aVar : list) {
                if ((aVar instanceof CommercialItem) && L.f(aVar.getF82707c(), commercialItem.getF82707c())) {
                    aVar = commercialItem;
                }
                arrayList.add(aVar);
            }
            Object objEmit = z12.emit(new Mg.c(((Mg.c) z12.getValue()).f10985a, arrayList), continuationImpl);
            if (objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objEmit;
            }
        }
        return G0.f406611a;
    }

    @Override // Mg.InterfaceC14486a
    @k
    public final n2<Mg.c> c(@l String str) {
        f(str);
        return (n2) this.f98267d.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0107 A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:53:0x00e2, B:55:0x00f1, B:57:0x00f9, B:59:0x00fd, B:63:0x010c, B:65:0x011b, B:62:0x0107, B:49:0x00ce), top: B:74:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #0 {all -> 0x0105, blocks: (B:53:0x00e2, B:55:0x00f1, B:57:0x00f9, B:59:0x00fd, B:63:0x010c, B:65:0x011b, B:62:0x0107, B:49:0x00ce), top: B:74:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    @Override // Mg.InterfaceC14486a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.l java.lang.String r17, @Y61.k Y41.l r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avl.repo.a.d(java.lang.String, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // Mg.InterfaceC14486a
    @l
    public final Object e(@l String str, @k String str2, @k Continuation<? super G0> continuation) {
        Z1 z12 = (Z1) this.f98267d.get(str);
        if (z12 != null) {
            List<com.avito.conveyor_item.a> list = ((Mg.c) z12.getValue()).f10986b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (com.avito.conveyor_item.a aVarCopyWithIsHidden : list) {
                if ((aVarCopyWithIsHidden instanceof i) && L.f(aVarCopyWithIsHidden.getF82707c(), str2)) {
                    aVarCopyWithIsHidden = ((i) aVarCopyWithIsHidden).copyWithIsHidden(true);
                }
                arrayList.add(aVarCopyWithIsHidden);
            }
            Object objEmit = z12.emit(new Mg.c(((Mg.c) z12.getValue()).f10985a, arrayList), continuation);
            if (objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objEmit;
            }
        }
        return G0.f406611a;
    }

    public final void f(String str) {
        LinkedHashMap linkedHashMap = this.f98267d;
        if (linkedHashMap.get(str) == null) {
            linkedHashMap.put(str, p2.a(new Mg.c(0, null, 3, null)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Integer r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avl.repo.a.h(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
