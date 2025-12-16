package nE0;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ThemeSettingsResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnE0/b;", "LnE0/a;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nE0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44243b implements InterfaceC44242a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f414948a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f414949b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414950c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Drawable f414951d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f414952e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Drawable f414953f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f414954g;

    @Inject
    public C44243b(@k Context context) {
        this.f414948a = context;
        this.f414949b = com.avito.android.lib.util.darkTheme.c.a(context);
        this.f414950c = context.getString(R.string.auto_battery_mode_title);
        this.f414951d = context.getDrawable(R.drawable.ic_phone_dark);
        this.f414952e = context.getString(R.string.dark_mode_title);
        this.f414953f = context.getDrawable(R.drawable.ic_phone_light);
        this.f414954g = context.getString(R.string.light_mode_title);
    }

    @Override // nE0.InterfaceC44242a
    @k
    /* renamed from: a, reason: from getter */
    public final String getF414952e() {
        return this.f414952e;
    }

    @Override // nE0.InterfaceC44242a
    @k
    /* renamed from: b, reason: from getter */
    public final String getF414950c() {
        return this.f414950c;
    }

    @Override // nE0.InterfaceC44242a
    @k
    public final String c() {
        Context context = this.f414948a;
        return context.getResources().getBoolean(R.bool.is_tablet) ? context.getString(R.string.tablet_follow_system_mode_subtitle) : context.getString(R.string.follow_system_mode_subtitle);
    }

    @Override // nE0.InterfaceC44242a
    @k
    public final String d() {
        Context context = this.f414948a;
        return context.getResources().getBoolean(R.bool.is_tablet) ? context.getString(R.string.tablet_follow_system_mode_title) : context.getString(R.string.follow_system_mode_title);
    }

    @Override // nE0.InterfaceC44242a
    @k
    /* renamed from: e, reason: from getter */
    public final Drawable getF414953f() {
        return this.f414953f;
    }

    @Override // nE0.InterfaceC44242a
    @k
    /* renamed from: f, reason: from getter */
    public final String getF414954g() {
        return this.f414954g;
    }

    @Override // nE0.InterfaceC44242a
    /* renamed from: g, reason: from getter */
    public final boolean getF414949b() {
        return this.f414949b;
    }

    @Override // nE0.InterfaceC44242a
    @k
    public final String h() {
        Context context = this.f414948a;
        return context.getResources().getBoolean(R.bool.is_tablet) ? context.getString(R.string.tablet_auto_battery_mode_subtitle) : context.getString(R.string.auto_battery_mode_subtitle);
    }

    @Override // nE0.InterfaceC44242a
    @k
    /* renamed from: i, reason: from getter */
    public final Drawable getF414951d() {
        return this.f414951d;
    }
}
