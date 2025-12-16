package com.avito.android.messenger.channels.mvi.view;

import android.os.Bundle;
import com.avito.android.persistence.messenger.C33126v0;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33126v0 f188794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C33126v0 f188795m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f188796n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C33126v0 f188797o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Boolean f188798p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C33126v0 c33126v0, C33126v0 c33126v02, String str, C33126v0 c33126v03, Boolean bool) {
        super(1);
        this.f188794l = c33126v0;
        this.f188795m = c33126v02;
        this.f188796n = str;
        this.f188797o = c33126v03;
        this.f188798p = bool;
    }

    @Override // Y41.l
    public final G0 invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        C33126v0 c33126v0 = this.f188794l;
        bundle2.putSerializable("mainIncludeTags", new TreeSet((SortedSet) c33126v0.f215552a));
        bundle2.putSerializable("mainExcludeTags", new TreeSet((SortedSet) c33126v0.f215553b));
        C33126v0 c33126v02 = this.f188795m;
        bundle2.putSerializable("mergedIncludeTags", new TreeSet((SortedSet) c33126v02.f215552a));
        bundle2.putSerializable("merdgedExcludeTags", new TreeSet((SortedSet) c33126v02.f215553b));
        String str = this.f188796n;
        if (str != null) {
            bundle2.putString("fromPage", str);
        }
        C33126v0 c33126v03 = this.f188797o;
        if (c33126v03 != null) {
            bundle2.putSerializable("pinnedIncludeTags", new TreeSet((SortedSet) c33126v03.f215552a));
            bundle2.putSerializable("pinnedExcludeTags", new TreeSet((SortedSet) c33126v03.f215553b));
        }
        Boolean bool = this.f188798p;
        if (bool != null) {
            bundle2.putBoolean("enableUnreadFilter", bool.booleanValue());
        }
        return G0.f406611a;
    }
}
