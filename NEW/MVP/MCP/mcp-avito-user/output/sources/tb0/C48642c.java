package tb0;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: ReplacingPhoneResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb0/c;", "Ltb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tb0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48642c implements InterfaceC48640a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439314a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439315b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f439316c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f439317d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f439318e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f439319f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f439320g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f439321h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f439322i;

    public C48642c(@k String str, @k Resources resources, int i12) {
        String strReplace = str.replace(' ', (char) 160);
        this.f439314a = resources.getString(R.string.replace_phone_success, strReplace, "*");
        this.f439315b = resources.getString(R.string.replace_phone_screen_title, strReplace);
        this.f439316c = resources.getString(R.string.replace_phone_usage_description, resources.getQuantityString(R.plurals.adverts_count_accusative, i12, Integer.valueOf(i12)));
        this.f439317d = resources.getString(R.string.phone_input_placeholder);
        this.f439318e = resources.getString(R.string.replace_phone_details);
        this.f439319f = resources.getString(R.string.replace_phone_button_text);
        this.f439320g = resources.getString(R.string.phone_select_error);
        this.f439321h = resources.getString(R.string.phone_select_title);
        this.f439322i = resources.getString(R.string.phone_action_error);
    }

    @Override // tb0.InterfaceC48640a
    @k
    public final String a(@l String str) {
        if (str == null) {
            str = "";
        }
        return C43066x.a0(this.f439314a, "*", str, false);
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: b, reason: from getter */
    public final String getF439319f() {
        return this.f439319f;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: c, reason: from getter */
    public final String getF439322i() {
        return this.f439322i;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: d, reason: from getter */
    public final String getF439317d() {
        return this.f439317d;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: e, reason: from getter */
    public final String getF439321h() {
        return this.f439321h;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: f, reason: from getter */
    public final String getF439320g() {
        return this.f439320g;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: g, reason: from getter */
    public final String getF439318e() {
        return this.f439318e;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: getDescription, reason: from getter */
    public final String getF439316c() {
        return this.f439316c;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: getHeader, reason: from getter */
    public final String getF439315b() {
        return this.f439315b;
    }
}
