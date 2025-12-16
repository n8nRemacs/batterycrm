package zU;

import AK0.l;
import Y61.k;
import kotlin.Metadata;
import oV0.d;

/* compiled from: PreferencesKeyValueStorage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"LzU/a;", "LoV0/d;", "", "_design-modules_beduin-v2_interactions_repository_common_persistent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zU.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50511a implements d<String, String> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f444046a;

    public C50511a(@k l lVar) {
        this.f444046a = lVar;
    }

    @Override // oV0.d
    public final void a(String str) {
        this.f444046a.remove(str);
    }

    @Override // oV0.d
    public final String b(String str) {
        return this.f444046a.getString(str);
    }

    @Override // oV0.d
    public final void c(Object obj, String str) {
        this.f444046a.putString(str, (String) obj);
    }
}
