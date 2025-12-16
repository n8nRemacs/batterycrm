package tb0;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SettingPhoneForAllResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb0/e;", "Ltb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements InterfaceC48640a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439323a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439324b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f439325c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f439326d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f439327e;

    public e(@k Resources resources, @k String str) {
        String strReplace = str.replace(' ', (char) 160);
        this.f439323a = resources.getString(R.string.set_phone_for_all_success, strReplace);
        this.f439324b = resources.getString(R.string.set_phone_for_all_screen_title, strReplace);
        this.f439325c = resources.getString(R.string.set_phone_for_all_description);
        this.f439326d = resources.getString(R.string.set_phone_for_all_button_text);
        this.f439327e = resources.getString(R.string.phone_action_error);
    }

    @Override // tb0.InterfaceC48640a
    @k
    public final String a(@l String str) {
        return this.f439323a;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: b, reason: from getter */
    public final String getF439326d() {
        return this.f439326d;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: c, reason: from getter */
    public final String getF439327e() {
        return this.f439327e;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: d */
    public final String getF439308d() {
        return "";
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: e */
    public final String getF439312h() {
        return "";
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: f */
    public final String getF439311g() {
        return "";
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: g */
    public final String getF439309e() {
        return "";
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: getDescription, reason: from getter */
    public final String getF439325c() {
        return this.f439325c;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: getHeader, reason: from getter */
    public final String getF439324b() {
        return this.f439324b;
    }
}
