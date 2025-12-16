package com.avito.android.publish.details;

import Cd0.C;
import Cd0.C13292z;
import Ju.InterfaceC14249c;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.publish.analytics.InterfaceC33535v;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: PublishDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "event", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.details.z0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33808z0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFragment f235114b;

    public C33808z0(PublishDetailsFragment publishDetailsFragment) {
        this.f235114b = publishDetailsFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        String f206980c;
        int i12;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof JobMultiGeoLink.a.d;
        PublishDetailsFragment publishDetailsFragment = this.f235114b;
        if (z12) {
            C33789t c33789t = publishDetailsFragment.f233108S2;
            (c33789t != null ? c33789t : null).j3(publishDetailsFragment.requireContext().getString(R.string.address_error));
            return;
        }
        JobMultiGeoLink.a.h hVar = interfaceC14249c instanceof JobMultiGeoLink.a.h ? (JobMultiGeoLink.a.h) interfaceC14249c : null;
        if (hVar == null) {
            return;
        }
        boolean z13 = hVar instanceof JobMultiGeoLink.a.C6170a;
        if (z13) {
            JobMultiGeoLink.a.C6170a c6170a = (JobMultiGeoLink.a.C6170a) hVar;
            C.a aVar = new C.a(String.valueOf(c6170a.f206974e), String.valueOf(c6170a.f206973d));
            InterfaceC33535v interfaceC33535v = publishDetailsFragment.f233101P0;
            if (interfaceC33535v == null) {
                interfaceC33535v = null;
            }
            interfaceC33535v.g(aVar);
        } else {
            if (hVar instanceof JobMultiGeoLink.a.c ? true : hVar instanceof JobMultiGeoLink.a.b) {
                JobMultiGeoLink.a.g gVar = hVar instanceof JobMultiGeoLink.a.g ? (JobMultiGeoLink.a.g) hVar : null;
                if (gVar != null) {
                    if (!(gVar instanceof JobMultiGeoLink.a.c)) {
                        str = gVar instanceof JobMultiGeoLink.a.b ? "delete" : "edit";
                    }
                    C13292z.a aVar2 = new C13292z.a(String.valueOf(gVar.getF206982e()), String.valueOf(gVar.getF206981d()), str);
                    InterfaceC33535v interfaceC33535v2 = publishDetailsFragment.f233101P0;
                    if (interfaceC33535v2 == null) {
                        interfaceC33535v2 = null;
                    }
                    interfaceC33535v2.u(aVar2);
                }
            }
        }
        com.avito.android.details.b bVar = publishDetailsFragment.f135892n0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.J(hVar.getF206984b());
        C33789t c33789t2 = publishDetailsFragment.f233108S2;
        if (c33789t2 == null) {
            c33789t2 = null;
        }
        JobMultiGeoLink.a.f fVar = interfaceC14249c instanceof JobMultiGeoLink.a.f ? (JobMultiGeoLink.a.f) interfaceC14249c : null;
        if (fVar == null || (f206980c = fVar.getF206980c()) == null) {
            return;
        }
        Context contextRequireContext = publishDetailsFragment.requireContext();
        if (z13) {
            i12 = R.string.address_added;
        } else if (hVar instanceof JobMultiGeoLink.a.c) {
            i12 = R.string.address_edited;
        } else if (!(hVar instanceof JobMultiGeoLink.a.b)) {
            return;
        } else {
            i12 = R.string.address_deleted;
        }
        com.avito.android.user_address.e.b(c33789t2.f234941a, null, f206980c, contextRequireContext.getString(i12));
    }
}
