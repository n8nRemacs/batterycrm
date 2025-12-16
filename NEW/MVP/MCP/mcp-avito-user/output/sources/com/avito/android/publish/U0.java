package com.avito.android.publish;

import android.os.Bundle;
import com.avito.android.remote.model.publish.PublishInitialToast;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SingleUseParameterHolder.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/U0;", "Lcom/avito/android/publish/T0;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class U0 implements T0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public String f232090a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f232091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Boolean f232092c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Boolean f232093d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public PublishInitialToast f232094e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public PublishInitialToast f232095f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public String f232096g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public String f232097h;

    /* compiled from: SingleUseParameterHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/publish/U0$a;", "", "<init>", "()V", "", "KEY_BACKUP_FOCUS_ID", "Ljava/lang/String;", "KEY_BACKUP_FORCE_ERROR_CHECKING", "KEY_BACKUP_FROM_SOURCE", "KEY_BACKUP_TOAST", "KEY_FOCUS_ID", "KEY_FORCE_ERROR_CHECKING", "KEY_FROM_SOURCE", "KEY_TOAST", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public U0() {
    }

    @Override // com.avito.android.publish.T0
    @Y61.l
    public final PublishInitialToast a() {
        PublishInitialToast publishInitialToast = this.f232094e;
        if (publishInitialToast == null) {
            return null;
        }
        this.f232094e = null;
        return publishInitialToast;
    }

    @Override // com.avito.android.publish.T0
    public final void b(@Y61.k Bundle bundle) {
        this.f232090a = bundle.getString("KEY_FOCUS_ID");
        this.f232091b = bundle.getString("KEY_BACKUP_FOCUS_ID");
        this.f232092c = bundle.containsKey("KEY_FORCE_ERROR_CHECKING") ? Boolean.valueOf(bundle.getBoolean("KEY_FORCE_ERROR_CHECKING")) : null;
        this.f232093d = bundle.containsKey("KEY_BACKUP_FORCE_ERROR_CHECKING") ? Boolean.valueOf(bundle.getBoolean("KEY_BACKUP_FORCE_ERROR_CHECKING")) : null;
        this.f232094e = (PublishInitialToast) bundle.getParcelable("KEY_TOAST");
        this.f232095f = (PublishInitialToast) bundle.getParcelable("KEY_BACKUP_TOAST");
        this.f232096g = bundle.getString("KEY_FROM_SOURCE");
        this.f232097h = bundle.getString("KEY_BACKUP_FROM_SOURCE");
    }

    @Override // com.avito.android.publish.T0
    @Y61.l
    public final String c() {
        String str = this.f232090a;
        if (str == null) {
            return null;
        }
        this.f232090a = null;
        return str;
    }

    @Override // com.avito.android.publish.T0
    public final void d(@Y61.k String str) {
        this.f232090a = str;
        this.f232091b = str;
    }

    @Override // com.avito.android.publish.T0
    public final void e(@Y61.k String str) {
        this.f232096g = str;
        this.f232097h = str;
    }

    @Override // com.avito.android.publish.T0
    public final void f(@Y61.k PublishInitialToast publishInitialToast) {
        this.f232094e = publishInitialToast;
        this.f232095f = publishInitialToast;
    }

    @Override // com.avito.android.publish.T0
    public final void g(@Y61.k Bundle bundle) {
        bundle.putString("KEY_FOCUS_ID", this.f232090a);
        bundle.putString("KEY_BACKUP_FOCUS_ID", this.f232091b);
        Boolean bool = this.f232092c;
        if (bool != null) {
            bundle.putBoolean("KEY_FORCE_ERROR_CHECKING", bool.booleanValue());
        }
        Boolean bool2 = this.f232093d;
        if (bool2 != null) {
            bundle.putBoolean("KEY_BACKUP_FORCE_ERROR_CHECKING", bool2.booleanValue());
        }
        bundle.putParcelable("KEY_TOAST", this.f232094e);
        bundle.putParcelable("KEY_BACKUP_TOAST", this.f232095f);
        bundle.putString("KEY_FROM_SOURCE", this.f232096g);
        bundle.putString("KEY_BACKUP_FROM_SOURCE", this.f232097h);
    }

    @Override // com.avito.android.publish.T0
    public final void h(boolean z12) {
        this.f232092c = Boolean.valueOf(z12);
        this.f232093d = Boolean.valueOf(z12);
    }

    @Override // com.avito.android.publish.T0
    @Y61.l
    public final String i() {
        String str = this.f232096g;
        if (str == null) {
            return null;
        }
        this.f232096g = null;
        return str;
    }

    @Override // com.avito.android.publish.T0
    @Y61.l
    public final Boolean j(boolean z12) {
        if (!z12) {
            return this.f232093d;
        }
        Boolean bool = this.f232092c;
        if (bool == null) {
            return null;
        }
        this.f232092c = null;
        return bool;
    }
}
