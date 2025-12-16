package com.avito.android.upload_doc.lifecycle;

import OG0.a;
import Y41.l;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.avito.android.upload_doc.view.sections.GigUploadDocSectionsItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigUploadDocFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "documentId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ OG0.d f306845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GigUploadDocFragment f306846m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OG0.d dVar, GigUploadDocFragment gigUploadDocFragment) {
        super(1);
        this.f306845l = dVar;
        this.f306846m = gigUploadDocFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        com.avito.android.upload_doc.helpers.i iVar = com.avito.android.upload_doc.helpers.i.f306810a;
        List<GigUploadDocSectionsItem> list = this.f306845l.f12138d;
        iVar.getClass();
        GigUploadDocDocumentItem gigUploadDocDocumentItemA = com.avito.android.upload_doc.helpers.i.a(str, list);
        if (gigUploadDocDocumentItemA != null) {
            ((h) this.f306846m.f306814o0.getValue()).accept(new a.d(gigUploadDocDocumentItemA));
        }
        return G0.f406611a;
    }
}
