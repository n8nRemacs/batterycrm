package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacRingingPlayer.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/b;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/a;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f165880a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f165881b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public e f165882c;

    /* compiled from: IacRingingPlayer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public b(@Y61.k f fVar, @Y61.k k kVar) {
        this.f165880a = fVar;
        this.f165881b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e r5) {
        /*
            r4 = this;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r0 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "update: lastState="
            r1.<init>(r2)
            com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e r2 = r4.f165882c
            r1.append(r2)
            java.lang.String r2 = ", newState="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String r3 = "IacRingingPlayer"
            r0.a(r3, r1, r2)
            com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e r0 = r4.f165882c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L47
            com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode r3 = r0.f165886b
            boolean r3 = r3.getIsRingtoneAllowed()
            if (r3 == 0) goto L34
            java.lang.String r0 = r0.f165885a
            if (r0 == 0) goto L34
            r0 = r2
            goto L35
        L34:
            r0 = r1
        L35:
            com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode r3 = r5.f165886b
            boolean r3 = r3.getIsRingtoneAllowed()
            if (r3 == 0) goto L43
            java.lang.String r3 = r5.f165885a
            if (r3 == 0) goto L43
            r3 = r2
            goto L44
        L43:
            r3 = r1
        L44:
            if (r0 != r3) goto L47
            goto L61
        L47:
            com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode r0 = r5.f165886b
            boolean r0 = r0.getIsRingtoneAllowed()
            if (r0 == 0) goto L55
            java.lang.String r0 = r5.f165885a
            if (r0 == 0) goto L55
            r0 = r2
            goto L56
        L55:
            r0 = r1
        L56:
            com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.f r3 = r4.f165880a
            if (r0 == 0) goto L5e
            r3.start()
            goto L61
        L5e:
            r3.stop()
        L61:
            com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e r0 = r4.f165882c
            if (r0 == 0) goto L86
            com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode r3 = r0.f165886b
            boolean r3 = r3.getIsVibrationAllowed()
            if (r3 == 0) goto L73
            java.lang.String r0 = r0.f165885a
            if (r0 == 0) goto L73
            r0 = r2
            goto L74
        L73:
            r0 = r1
        L74:
            com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode r3 = r5.f165886b
            boolean r3 = r3.getIsVibrationAllowed()
            if (r3 == 0) goto L82
            java.lang.String r3 = r5.f165885a
            if (r3 == 0) goto L82
            r3 = r2
            goto L83
        L82:
            r3 = r1
        L83:
            if (r0 != r3) goto L86
            goto L9e
        L86:
            com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode r0 = r5.f165886b
            boolean r0 = r0.getIsVibrationAllowed()
            if (r0 == 0) goto L93
            java.lang.String r0 = r5.f165885a
            if (r0 == 0) goto L93
            r1 = r2
        L93:
            com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k r0 = r4.f165881b
            if (r1 == 0) goto L9b
            r0.b()
            goto L9e
        L9b:
            r0.stop()
        L9e:
            r4.f165882c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.b.a(com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e):void");
    }
}
