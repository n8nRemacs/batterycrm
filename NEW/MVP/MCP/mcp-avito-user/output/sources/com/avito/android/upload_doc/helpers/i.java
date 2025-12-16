package com.avito.android.upload_doc.helpers;

import Y61.k;
import Y61.l;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.avito.android.upload_doc.view.sections.GigUploadDocSectionsItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SectionsHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/upload_doc/helpers/i;", "", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final i f306810a = new i();

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static GigUploadDocDocumentItem a(@k String str, @k List list) {
        GigUploadDocDocumentItem gigUploadDocDocumentItem;
        Iterator it = list.iterator();
        do {
            gigUploadDocDocumentItem = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it2 = ((GigUploadDocSectionsItem) it.next()).f307049f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (L.f(((GigUploadDocDocumentItem) next).f307011b, str)) {
                    gigUploadDocDocumentItem = next;
                    break;
                }
            }
            gigUploadDocDocumentItem = gigUploadDocDocumentItem;
        } while (gigUploadDocDocumentItem == null);
        return gigUploadDocDocumentItem;
    }
}
