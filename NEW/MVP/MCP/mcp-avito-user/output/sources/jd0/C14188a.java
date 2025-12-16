package Jd0;

import Jf0.InterfaceC14192a;
import com.avito.android.advert_core.price_list.v2.section.g;
import com.avito.android.advert_core.service_education.o;
import com.avito.android.deep_linking.x;
import com.avito.android.shortcut_navigation_bar.C34999p;
import h31.e;
import t80.InterfaceC48515a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Jd0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class C14188a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9070b;

    public /* synthetic */ C14188a(Object obj, int i12) {
        this.f9069a = i12;
        this.f9070b = obj;
    }

    @Override // h31.e
    public final Object get() {
        Object obj = this.f9070b;
        switch (this.f9069a) {
            case 0:
                int i12 = b.f9071a;
                return (InterfaceC48515a) obj;
            case 1:
                return ((g) obj).f84174e;
            case 2:
                return ((o) obj).f84330e;
            case 3:
                com.avito.android.publish.category_edit.di.c cVar = com.avito.android.publish.category_edit.di.c.f232350a;
                return (InterfaceC14192a) obj;
            case 4:
                return ((com.avito.android.publish.screen.objects.domain.repository.g) obj).f240025c.Dc();
            case 5:
                return (x) obj;
            default:
                return ((C34999p) obj).f283471Z;
        }
    }
}
