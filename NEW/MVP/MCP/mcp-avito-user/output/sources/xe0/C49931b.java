package xe0;

import Y61.k;
import Y61.l;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishBadgeStorage.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxe0/b;", "Lxe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xe0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49931b implements InterfaceC49930a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f442589a;

    @Inject
    public C49931b(@k SharedPreferences sharedPreferences) {
        this.f442589a = sharedPreferences;
    }

    @Override // xe0.InterfaceC49930a
    @l
    public final String a(@l String str, @l String str2) {
        SharedPreferences sharedPreferences = this.f442589a;
        if (str != null ? sharedPreferences.getBoolean(str, false) : false) {
            return null;
        }
        if (str == null) {
            return str2;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(str, true);
        editorEdit.apply();
        return str2;
    }
}
