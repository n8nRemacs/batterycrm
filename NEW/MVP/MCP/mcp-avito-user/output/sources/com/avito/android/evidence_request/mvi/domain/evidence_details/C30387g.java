package com.avito.android.evidence_request.mvi.domain.evidence_details;

import android.webkit.MimeTypeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: EvidenceFileConstraints.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/g;", "", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30387g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C30387g f148700a = new C30387g();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f148701b = C42727D.c(a.f148702l);

    /* compiled from: EvidenceFileConstraints.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.g$a */
    public static final class a extends N implements Y41.a<String[]> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f148702l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String[] invoke() {
            List listU = C42745f0.U("pdf", "jpg", "jpeg", "png", "doc", "docx", "xls", "xlsx", "zip");
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            ArrayList arrayList = new ArrayList();
            Iterator it = listU.iterator();
            while (it.hasNext()) {
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension((String) it.next());
                if (mimeTypeFromExtension != null) {
                    arrayList.add(mimeTypeFromExtension);
                }
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }
}
