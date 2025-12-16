package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import com.google.android.gms.common.util.InterfaceC36753g;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36998x extends AbstractC36884g3 {

    /* renamed from: c, reason: collision with root package name */
    public long f355471c;

    /* renamed from: d, reason: collision with root package name */
    public String f355472d;

    /* renamed from: e, reason: collision with root package name */
    public AccountManager f355473e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f355474f;

    /* renamed from: g, reason: collision with root package name */
    public long f355475g;

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36884g3
    public final boolean h() {
        Calendar calendar = Calendar.getInstance();
        this.f355471c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f355472d = androidx.appcompat.app.r.r(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    @j.l0
    public final long i() {
        super.e();
        return this.f355475g;
    }

    public final long j() {
        f();
        return this.f355471c;
    }

    public final String k() {
        f();
        return this.f355472d;
    }

    @j.l0
    public final void l() {
        super.e();
        this.f355474f = null;
        this.f355475g = 0L;
    }

    @j.l0
    public final boolean m() throws OperationCanceledException, IOException, AuthenticatorException {
        Account[] result;
        super.e();
        I2 i22 = this.f355183a;
        i22.f354722n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f355475g > 86400000) {
            this.f355474f = null;
        }
        Boolean bool = this.f355474f;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context context = i22.f354709a;
        if (androidx.core.content.d.checkSelfPermission(context, "android.permission.GET_ACCOUNTS") != 0) {
            super.zzj().f354893j.b("Permission error checking for dasher/unicorn accounts");
            this.f355475g = jCurrentTimeMillis;
            this.f355474f = Boolean.FALSE;
            return false;
        }
        if (this.f355473e == null) {
            this.f355473e = AccountManager.get(context);
        }
        try {
            result = this.f355473e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e12) {
            e = e12;
            super.zzj().f354890g.c("Exception checking account types", e);
            this.f355475g = jCurrentTimeMillis;
            this.f355474f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e13) {
            e = e13;
            super.zzj().f354890g.c("Exception checking account types", e);
            this.f355475g = jCurrentTimeMillis;
            this.f355474f = Boolean.FALSE;
            return false;
        } catch (IOException e14) {
            e = e14;
            super.zzj().f354890g.c("Exception checking account types", e);
            this.f355475g = jCurrentTimeMillis;
            this.f355474f = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.f355474f = Boolean.TRUE;
            this.f355475g = jCurrentTimeMillis;
            return true;
        }
        Account[] result2 = this.f355473e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f355474f = Boolean.TRUE;
            this.f355475g = jCurrentTimeMillis;
            return true;
        }
        this.f355475g = jCurrentTimeMillis;
        this.f355474f = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
