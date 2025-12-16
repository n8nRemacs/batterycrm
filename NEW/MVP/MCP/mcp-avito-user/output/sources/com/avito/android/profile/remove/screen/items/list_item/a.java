package com.avito.android.profile.remove.screen.items.list_item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/list_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224097b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f224098c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ProfileRemovalScreen f224099d;

    public a(@k String str, @k String str2, @k ProfileRemovalScreen profileRemovalScreen) {
        this.f224097b = str;
        this.f224098c = str2;
        this.f224099d = profileRemovalScreen;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f224097b, aVar.f224097b) && L.f(this.f224098c, aVar.f224098c) && L.f(this.f224099d, aVar.f224099d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF224097b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224097b() {
        return this.f224097b;
    }

    public final int hashCode() {
        return this.f224099d.hashCode() + H.d(this.f224097b.hashCode() * 31, 31, this.f224098c);
    }

    @k
    public final String toString() {
        return "ListItem(stringId=" + this.f224097b + ", text=" + this.f224098c + ", next=" + this.f224099d + ')';
    }
}
