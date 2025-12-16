package l90;

import android.content.SharedPreferences;
import com.avito.android.remote.model.ProfileInfo;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: MutableProfileInfoStorageImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll90/h;", "Ll90/g;", "_avito_preferences-profile-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f413554a;

    @Inject
    public h(@Y61.k AK0.l lVar) {
        this.f413554a = lVar;
    }

    @Override // l90.g
    public final void a(@Y61.k ProfileInfo profileInfo) {
        SharedPreferences.Editor editorEdit = this.f413554a.getF316a().edit();
        AK0.m.f310a.getClass();
        editorEdit.putString(AK0.m.f311b, profileInfo.getUserId()).putString(AK0.m.f312c, profileInfo.getUserHashId()).putString(AK0.m.f313d, profileInfo.getName()).putString(AK0.m.f314e, profileInfo.getEmail()).apply();
    }

    @Override // l90.g
    public final void b() {
        SharedPreferences.Editor editorEdit = this.f413554a.getF316a().edit();
        AK0.m.f310a.getClass();
        editorEdit.remove(AK0.m.f311b).remove(AK0.m.f312c).remove(AK0.m.f313d).remove(AK0.m.f314e).remove(AK0.m.f315f).apply();
    }

    @Override // l90.n
    @Y61.k
    public final ProfileInfo e() {
        SharedPreferences f316a = this.f413554a.getF316a();
        AK0.m.f310a.getClass();
        return new ProfileInfo(f316a.getString(AK0.m.f311b, null), f316a.getString(AK0.m.f312c, null), f316a.getString(AK0.m.f313d, null), f316a.getString(AK0.m.f314e, null));
    }
}
