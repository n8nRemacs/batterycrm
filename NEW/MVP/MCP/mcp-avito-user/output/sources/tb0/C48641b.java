package tb0;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: RemovingPhoneResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltb0/b;", "Ltb0/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C48641b implements InterfaceC48640a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439305a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f439306b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f439307c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f439308d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f439309e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f439310f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f439311g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f439312h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f439313i;

    public C48641b(@k String str, @k Resources resources, int i12) {
        String strReplace = str.replace(' ', (char) 160);
        this.f439305a = resources.getString(R.string.phone_removed_success, strReplace);
        this.f439306b = resources.getString(R.string.remove_phone_screen_title, strReplace);
        this.f439307c = i12 == 0 ? resources.getString(R.string.phone_removing_details_with_pronoun) : resources.getString(R.string.remove_phone_usage_description, resources.getQuantityString(R.plurals.adverts_count_accusative, i12, Integer.valueOf(i12)));
        this.f439308d = resources.getString(R.string.phone_input_placeholder);
        this.f439309e = resources.getString(R.string.phone_removing_details);
        this.f439310f = resources.getString(i12 == 0 ? R.string.phone_remove_button_text : R.string.phone_remove_countinue_button_text);
        this.f439311g = resources.getString(R.string.phone_select_error);
        this.f439312h = resources.getString(R.string.phone_select_title);
        this.f439313i = resources.getString(R.string.phone_action_error);
    }

    @Override // tb0.InterfaceC48640a
    @k
    public final String a(@l String str) {
        return this.f439305a;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: b, reason: from getter */
    public final String getF439326d() {
        return this.f439310f;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: c, reason: from getter */
    public final String getF439327e() {
        return this.f439313i;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: d, reason: from getter */
    public final String getF439308d() {
        return this.f439308d;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: e, reason: from getter */
    public final String getF439312h() {
        return this.f439312h;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: f, reason: from getter */
    public final String getF439311g() {
        return this.f439311g;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: g, reason: from getter */
    public final String getF439309e() {
        return this.f439309e;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: getDescription, reason: from getter */
    public final String getF439325c() {
        return this.f439307c;
    }

    @Override // tb0.InterfaceC48640a
    @k
    /* renamed from: getHeader, reason: from getter */
    public final String getF439324b() {
        return this.f439306b;
    }
}
