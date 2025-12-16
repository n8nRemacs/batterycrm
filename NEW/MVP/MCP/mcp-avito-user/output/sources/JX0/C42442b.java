package jx0;

import AK0.l;
import Y61.k;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;

/* compiled from: SocialNotificationStateStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljx0/b;", "Ljx0/a;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42442b implements InterfaceC42441a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f405895a;

    @Inject
    public C42442b(@k l lVar) {
        this.f405895a = lVar;
    }

    @Override // jx0.InterfaceC42441a
    public final void a(@k String str) {
        l lVar = this.f405895a;
        Set<String> setF = lVar.f("closed_social_notifications");
        if (setF == null) {
            setF = B0.f406639b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(setF);
        linkedHashSetO0.add(str);
        lVar.putStringSet("closed_social_notifications", linkedHashSetO0);
    }

    @Override // jx0.InterfaceC42441a
    public final void clear() {
        this.f405895a.remove("closed_social_notifications");
    }
}
