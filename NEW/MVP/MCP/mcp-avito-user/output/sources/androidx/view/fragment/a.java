package androidx.view.fragment;

import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;
import com.avito.android.virtual_deal_room.client_room.ClientRoomFragment;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements A {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53124b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f53125c;

    public /* synthetic */ a(Object obj, int i12) {
        this.f53124b = i12;
        this.f53125c = obj;
    }

    @Override // androidx.fragment.app.A
    public final void a(Fragment fragment) {
        Object obj = this.f53125c;
        switch (this.f53124b) {
            case 0:
                b bVar = (b) obj;
                LinkedHashSet linkedHashSet = bVar.f53129e;
                if (v0.a(linkedHashSet).remove(fragment.getTag())) {
                    fragment.getLifecycle().a(bVar.f53130f);
                }
                LinkedHashMap linkedHashMap = bVar.f53131g;
                v0.c(linkedHashMap).remove(fragment.getTag());
                break;
            default:
                ClientRoomFragment.a aVar = ClientRoomFragment.f326248u0;
                ((ClientRoomFragment) obj).r5(fragment);
                break;
        }
    }
}
