package Eb0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.profile_settings.ProfileSettingsMviFragment;
import com.avito.android.profile_settings.TabItem;
import com.avito.android.profile_settings_basic.BasicProfileSettingsFragment;
import com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSettingsPagerAdapter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEb0/a;", "Landroidx/viewpager2/adapter/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Eb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13470a extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @k
    public final j<TabItem> f4098k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ProfileSettingsMviFragment.Args f4099l;

    public C13470a(@k Fragment fragment, @k j<TabItem> jVar, @k ProfileSettingsMviFragment.Args args) {
        super(fragment);
        this.f4098k = jVar;
        this.f4099l = args;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4098k.getCount();
    }

    @Override // androidx.viewpager2.adapter.b
    @k
    public final Fragment l(int i12) {
        j<TabItem> jVar = this.f4098k;
        String str = jVar.getItem(i12).f228384e;
        boolean zF2 = L.f(str, "basic");
        ProfileSettingsMviFragment.Args args = this.f4099l;
        if (zF2) {
            BasicProfileSettingsFragment.a aVar = BasicProfileSettingsFragment.f228515y0;
            BasicProfileSettingsFragment.BasicProfileSettingsArgs basicProfileSettingsArgs = new BasicProfileSettingsFragment.BasicProfileSettingsArgs(jVar.getCount() > 1, args.f228372c);
            aVar.getClass();
            return BasicProfileSettingsFragment.a.a(basicProfileSettingsArgs);
        }
        if (!L.f(str, MessageBody.SystemMessageBody.Platform.Bubble.Item.EXTENDED)) {
            throw new IllegalStateException("Unknown shortcut!");
        }
        ExtendedProfileSettingsFragment.a aVar2 = ExtendedProfileSettingsFragment.f228997J0;
        String str2 = args.f228374e;
        aVar2.getClass();
        return ExtendedProfileSettingsFragment.a.a(str2);
    }
}
