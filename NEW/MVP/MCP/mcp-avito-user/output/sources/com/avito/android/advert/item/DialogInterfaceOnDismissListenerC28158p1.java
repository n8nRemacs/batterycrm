package com.avito.android.advert.item;

import android.content.DialogInterface;
import com.avito.android.advert.item.C28144l;
import iR.C41336a;
import java.util.ArrayList;
import java.util.function.Predicate;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advert.item.p1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC28158p1 implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f78130c;

    public /* synthetic */ DialogInterfaceOnDismissListenerC28158p1(int i12, I1 i13) {
        this.f78129b = i12;
        this.f78130c = i13;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f78129b) {
            case 0:
                I1 i12 = this.f78130c;
                com.avito.android.advert.item.complementary.b bVar = i12.f71719j1;
                if (bVar != null) {
                    C28144l c28144l = bVar.f74577K;
                    com.avito.android.advert_collection_toast.a aVar = c28144l.f77246a;
                    aVar.a();
                    ArrayList arrayList = c28144l.f77247b;
                    final C28147m c28147m = new C28147m(bVar);
                    arrayList.removeIf(new Predicate() { // from class: com.avito.android.advert.item.k
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Boolean) c28147m.invoke(obj)).booleanValue();
                        }
                    });
                    if (!arrayList.isEmpty()) {
                        C28144l.a aVar2 = (C28144l.a) C42745f0.Q(arrayList);
                        aVar.d(aVar2.f77249b, aVar2.f77248a);
                    }
                    com.avito.android.advert.item.complementary.f fVar = bVar.f74578L;
                    if (fVar != null) {
                        fVar.f74596h.setAdapter(null);
                        fVar.f74593e.I();
                        fVar.f74594f.e0();
                    }
                    bVar.f74578L = null;
                }
                i12.f71719j1 = null;
                i12.f71681V.i();
                break;
            default:
                C41336a.C11375a.a();
                this.f78130c.f71739s.Xa();
                break;
        }
    }
}
