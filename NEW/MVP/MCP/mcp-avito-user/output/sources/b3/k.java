package B3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LastLoggedEmailStorageImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB3/k;", "LB3/f;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f847a;

    @Inject
    public k(@Y61.k SharedPreferences sharedPreferences) {
        this.f847a = sharedPreferences;
    }

    @Override // B3.f
    public final void a(@Y61.k String str) {
        SharedPreferences.Editor editorEdit = this.f847a.edit();
        if (TextUtils.isEmpty(str)) {
            AK0.h.f304a.getClass();
            editorEdit.remove(AK0.h.f305b);
        } else {
            AK0.h.f304a.getClass();
            editorEdit.putString(AK0.h.f305b, str);
        }
        editorEdit.apply();
    }

    @Override // B3.a
    @Y61.l
    public final String d() {
        AK0.h.f304a.getClass();
        return this.f847a.getString(AK0.h.f305b, null);
    }
}
