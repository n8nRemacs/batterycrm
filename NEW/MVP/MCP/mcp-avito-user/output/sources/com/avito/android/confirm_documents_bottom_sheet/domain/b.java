package com.avito.android.confirm_documents_bottom_sheet.domain;

import Y61.k;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.job.confirm_documents_bottom_sheet_public.generated.api.shift_documents_status_v_1.ShiftDocumentsStatusV1ItemsItem;
import com.avito.android.remote.H;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConfirmDocumentsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/confirm_documents_bottom_sheet/domain/b;", "Lcom/avito/android/confirm_documents_bottom_sheet/domain/a;", "_avito_gig_confirm_documents_bottom_sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.confirm_documents_bottom_sheet.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final XO.a f125553a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f125554b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E f125555c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final H f125556d;

    /* compiled from: ConfirmDocumentsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125557a;

        static {
            int[] iArr = new int[ShiftDocumentsStatusV1ItemsItem.Status.values().length];
            try {
                iArr[ShiftDocumentsStatusV1ItemsItem.Status.NotStarted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShiftDocumentsStatusV1ItemsItem.Status.InProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShiftDocumentsStatusV1ItemsItem.Status.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShiftDocumentsStatusV1ItemsItem.Status.Failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f125557a = iArr;
        }
    }

    @Inject
    public b(@k XO.a aVar, @k InterfaceC28373a interfaceC28373a, @k E e12, @k H h12) {
        this.f125553a = aVar;
        this.f125554b = interfaceC28373a;
        this.f125555c = e12;
        this.f125556d = h12;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.confirm_documents_bottom_sheet.domain.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r26, @Y61.l java.lang.String r27, @Y61.l java.lang.String r28, @Y61.l java.lang.String r29, @Y61.l java.lang.String r30, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.confirm_documents_bottom_sheet.domain.b.a(kotlinx.coroutines.flow.j, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ParametrizedClickStreamEvent b(YO.a aVar, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVar.b());
        String strA = this.f125555c.a();
        if (strA == null) {
            strA = "";
        }
        linkedHashMap.put("uid", strA);
        linkedHashMap.put("u", this.f125556d.getF253025a());
        linkedHashMap.put("business_platform", "3");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("iid", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("from_page", str2);
        return new ParametrizedClickStreamEvent((int) aVar.getId(), (int) aVar.getVersion(), linkedHashMap, null, 8, null);
    }
}
