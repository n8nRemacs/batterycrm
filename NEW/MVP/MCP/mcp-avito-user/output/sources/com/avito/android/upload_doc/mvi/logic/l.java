package com.avito.android.upload_doc.mvi.logic;

import android.net.Uri;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction;
import com.avito.android.upload_doc.view.checkbox.GigUploadDocCheckboxItem;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.avito.android.upload_doc.view.sections.GigUploadDocSectionsItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GigUploadDocReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/upload_doc/mvi/logic/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/upload_doc/mvi/entities/GigUploadDocInternalAction;", "LOG0/d;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<GigUploadDocInternalAction, OG0.d> {
    @Inject
    public l() {
    }

    public static OG0.d b(OG0.d dVar, GigUploadDocDocumentItem gigUploadDocDocumentItem, Uri uri, String str, boolean z12, boolean z13) {
        int i12;
        com.avito.android.upload_doc.helpers.i iVar = com.avito.android.upload_doc.helpers.i.f306810a;
        List<GigUploadDocSectionsItem> list = dVar.f12138d;
        iVar.getClass();
        Iterator<T> it = list.iterator();
        boolean z14 = false;
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            Object obj = null;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            Iterator<T> it2 = ((GigUploadDocSectionsItem) next).f307049f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (L.f(((GigUploadDocDocumentItem) next2).f307013d, gigUploadDocDocumentItem.f307013d)) {
                    obj = next2;
                    break;
                }
            }
            if (((GigUploadDocDocumentItem) obj) != null) {
                break;
            }
            i13 = i14;
        }
        if (i13 < 0) {
            return dVar;
        }
        List<GigUploadDocSectionsItem> list2 = dVar.f12138d;
        Iterator<GigUploadDocDocumentItem> it3 = list2.get(i13).f307049f.iterator();
        int i15 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (L.f(it3.next().f307013d, gigUploadDocDocumentItem.f307013d)) {
                i12 = i15;
                break;
            }
            i15++;
        }
        if (i12 < 0) {
            return dVar;
        }
        ArrayList arrayList = new ArrayList(list2.get(i13).f307049f);
        GigUploadDocDocumentItem gigUploadDocDocumentItem2 = (GigUploadDocDocumentItem) arrayList.get(i12);
        arrayList.set(i12, new GigUploadDocDocumentItem(gigUploadDocDocumentItem2.f307011b, gigUploadDocDocumentItem2.f307012c, gigUploadDocDocumentItem2.f307013d, gigUploadDocDocumentItem2.f307014e, uri, str, gigUploadDocDocumentItem2.f307017h, z12, z13));
        ArrayList arrayList2 = new ArrayList(list2);
        GigUploadDocSectionsItem gigUploadDocSectionsItem = (GigUploadDocSectionsItem) arrayList2.get(i13);
        arrayList2.set(i13, new GigUploadDocSectionsItem(gigUploadDocSectionsItem.f307045b, gigUploadDocSectionsItem.f307046c, gigUploadDocSectionsItem.f307047d, gigUploadDocSectionsItem.f307048e, arrayList));
        if (d(dVar.f12139e) && e(arrayList2)) {
            z14 = true;
        }
        return OG0.d.a(dVar, arrayList2, null, z14, false, false, 987);
    }

    public static OG0.d c(l lVar, OG0.d dVar, GigUploadDocDocumentItem gigUploadDocDocumentItem, Uri uri, String str, boolean z12, boolean z13, int i12) {
        if ((i12 & 2) != 0) {
            uri = gigUploadDocDocumentItem.f307015f;
        }
        Uri uri2 = uri;
        if ((i12 & 4) != 0) {
            str = gigUploadDocDocumentItem.f307016g;
        }
        lVar.getClass();
        return b(dVar, gigUploadDocDocumentItem, uri2, str, z12, z13);
    }

    public static boolean d(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((GigUploadDocCheckboxItem) it.next()).f306972d) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GigUploadDocSectionsItem gigUploadDocSectionsItem = (GigUploadDocSectionsItem) it.next();
            if (gigUploadDocSectionsItem.f307048e) {
                List<GigUploadDocDocumentItem> list2 = gigUploadDocSectionsItem.f307049f;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((GigUploadDocDocumentItem) it2.next()).f307016g == null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static OG0.d f(OG0.d dVar, GigUploadDocCheckboxItem gigUploadDocCheckboxItem, boolean z12) {
        ArrayList arrayList = new ArrayList(dVar.f12139e);
        int iIndexOf = arrayList.indexOf(gigUploadDocCheckboxItem);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, new GigUploadDocCheckboxItem(gigUploadDocCheckboxItem.f306971c, gigUploadDocCheckboxItem.f306970b, z12));
        }
        return OG0.d.a(dVar, null, arrayList, d(arrayList) && e(dVar.f12138d), false, false, 983);
    }

    @Override // com.avito.android.arch.mvi.u
    public final OG0.d a(GigUploadDocInternalAction gigUploadDocInternalAction, OG0.d dVar) {
        GigUploadDocInternalAction gigUploadDocInternalAction2 = gigUploadDocInternalAction;
        OG0.d dVar2 = dVar;
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.ShowContent) {
            GigUploadDocInternalAction.ShowContent showContent = (GigUploadDocInternalAction.ShowContent) gigUploadDocInternalAction2;
            DeepLink deepLink = showContent.f306875f;
            return new OG0.d(showContent.f306871b, showContent.f306872c, showContent.f306873d, showContent.f306874e, showContent.f306876g, false, deepLink, deepLink != null, false, false);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.ShowLoading) {
            return OG0.d.a(dVar2, null, null, false, true, false, 127);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.ShowError) {
            return OG0.d.a(dVar2, null, null, false, false, true, 127);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.AgreeToTerms) {
            return f(dVar2, ((GigUploadDocInternalAction.AgreeToTerms) gigUploadDocInternalAction2).f306853b, true);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DisagreeToTerms) {
            return f(dVar2, ((GigUploadDocInternalAction.DisagreeToTerms) gigUploadDocInternalAction2).f306855b, false);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.AddDocument) {
            GigUploadDocInternalAction.AddDocument addDocument = (GigUploadDocInternalAction.AddDocument) gigUploadDocInternalAction2;
            return c(this, dVar2, addDocument.f306850d, addDocument.f306851e, null, false, false, 4);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DocumentLoading) {
            return c(this, dVar2, ((GigUploadDocInternalAction.DocumentLoading) gigUploadDocInternalAction2).f306862d, null, null, true, false, 6);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DocumentLoaded) {
            GigUploadDocInternalAction.DocumentLoaded documentLoaded = (GigUploadDocInternalAction.DocumentLoaded) gigUploadDocInternalAction2;
            return c(this, dVar2, documentLoaded.f306860b, null, documentLoaded.f306861c, false, false, 2);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.DocumentError) {
            return c(this, dVar2, ((GigUploadDocInternalAction.DocumentError) gigUploadDocInternalAction2).f306857c, null, null, false, true, 6);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.RemoveDocument) {
            return b(dVar2, ((GigUploadDocInternalAction.RemoveDocument) gigUploadDocInternalAction2).f306865b, null, null, false, false);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.SendDocumentsLoading) {
            return OG0.d.a(dVar2, null, null, false, true, false, 767);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.SendDocumentsDone) {
            return OG0.d.a(dVar2, null, null, false, false, false, 767);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.SendDocumentsError) {
            return OG0.d.a(dVar2, null, null, false, false, false, 767);
        }
        if (gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.PickDocument ? true : gigUploadDocInternalAction2 instanceof GigUploadDocInternalAction.Close) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
