package com.avito.android.version_conflict;

import aN0.C19794a;
import android.content.Context;
import android.content.Intent;
import cN0.C27072a;
import com.avito.android.P;
import com.avito.android.ab_tests.configs.ForceUpdateProposalTestGroup;
import com.avito.android.forceupdate.domain.dto.UpdateSource;
import com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootActivity;
import com.avito.android.forceupdate.screens.forceupdateroot.ForceUpdateRootOpenParams;
import com.avito.android.remote.config.AppConfig;
import com.avito.android.remote.config.ValidateVersionStatus;
import com.avito.android.util.InterfaceC35950u;
import com.squareup.anvil.annotations.ContributesBinding;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import u3.InterfaceC48779c;
import ur.InterfaceC49101b;

/* compiled from: VersionConflictScreenOpenerImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/j;", "Lcom/avito/android/version_conflict/i;", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P f325909a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48779c<ForceUpdateProposalTestGroup> f325910b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f325911c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f325912d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C19794a f325913e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final b f325914f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C27072a f325915g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35950u f325916h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f325917i;

    /* compiled from: VersionConflictScreenOpenerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ValidateVersionStatus.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ValidateVersionStatus validateVersionStatus = ValidateVersionStatus.f253346b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ValidateVersionStatus validateVersionStatus2 = ValidateVersionStatus.f253346b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ValidateVersionStatus validateVersionStatus3 = ValidateVersionStatus.f253346b;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public j(@Y61.k P p12, @Y61.k InterfaceC48779c<ForceUpdateProposalTestGroup> interfaceC48779c, @Y61.k Context context, @Y61.k e eVar, @Y61.k C19794a c19794a, @Y61.k b bVar, @Y61.k C27072a c27072a, @Y61.k InterfaceC35950u interfaceC35950u, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f325909a = p12;
        this.f325910b = interfaceC48779c;
        this.f325911c = context;
        this.f325912d = eVar;
        this.f325913e = c19794a;
        this.f325914f = bVar;
        this.f325915g = c27072a;
        this.f325916h = interfaceC35950u;
        this.f325917i = interfaceC49101b;
    }

    public static UpdateSource e(AppConfig appConfig) {
        String str;
        return (appConfig.f253326e != AppConfig.UpdateSource.f253334d || (str = appConfig.f253327f) == null) ? UpdateSource.Official.f158466b : new UpdateSource.Custom(str);
    }

    @Override // com.avito.android.version_conflict.i
    public final void a() {
        int iOrdinal = this.f325913e.f20892a.P0().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                f(new ForceUpdateRootOpenParams.UpdateRequired(d()));
                return;
            } else {
                if (iOrdinal != 3) {
                    return;
                }
                f(ForceUpdateRootOpenParams.DeviceNotSupported.f158555b);
                return;
            }
        }
        ForceUpdateProposalTestGroup forceUpdateProposalTestGroupA = this.f325910b.a();
        forceUpdateProposalTestGroupA.getClass();
        if (forceUpdateProposalTestGroupA == ForceUpdateProposalTestGroup.f67816c) {
            C27072a c27072a = this.f325915g;
            if (LocalDateTime.ofInstant(Instant.ofEpochMilli(((AK0.l) c27072a.f57837a.f325904c.getValue()).getLong("update_proposal_dialog_shown_timestamp", 0L)), ZoneId.systemDefault()).toLocalDate().equals(LocalDateTime.ofInstant(Instant.ofEpochMilli(c27072a.f57838b.now()), ZoneId.systemDefault()).toLocalDate())) {
                return;
            }
            f(new ForceUpdateRootOpenParams.UpdateProposal(d()));
        }
    }

    @Override // com.avito.android.version_conflict.i
    public final void b() {
        f(ForceUpdateRootOpenParams.DeviceNotSupported.f158555b);
    }

    @Override // com.avito.android.version_conflict.i
    public final boolean c() {
        return this.f325913e.f20892a.P0() == ValidateVersionStatus.f253349e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (((java.lang.Boolean) r4.f67394X.a().invoke()).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.forceupdate.domain.dto.UpdateSource d() throws java.lang.Throwable {
        /*
            r5 = this;
            com.avito.android.version_conflict.b r0 = r5.f325914f
            com.avito.android.remote.config.AppConfig r0 = r0.a()
            com.avito.android.util.u r1 = r5.f325916h
            r2 = 1
            if (r0 != 0) goto L1f
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Config should be present"
            r3.<init>(r4)
            boolean r1 = r1.l()
            r1 = r1 ^ r2
            r0.m(r3, r1)
            com.avito.android.forceupdate.domain.dto.UpdateSource$Official r0 = com.avito.android.forceupdate.domain.dto.UpdateSource.Official.f158466b
            return r0
        L1f:
            com.avito.android.remote.config.AppConfig$UpdateSourceType r3 = r0.f253328g
            if (r3 == 0) goto Lb3
            com.avito.android.remote.config.AppConfig$UpdateSourceType r4 = com.avito.android.remote.config.AppConfig.UpdateSourceType.f253340d
            if (r3 != r4) goto L28
            goto L29
        L28:
            r2 = 0
        L29:
            com.avito.android.remote.config.AppConfig$UpdateSourceType r4 = com.avito.android.remote.config.AppConfig.UpdateSourceType.f253341e
            if (r3 != r4) goto La3
            ur.b r2 = r5.f325917i
            boolean r2 = r2.c()
            if (r2 != 0) goto L9e
            com.avito.android.util.AppStore r2 = r1.getF125488h()
            com.avito.android.util.AppStore r3 = com.avito.android.util.AppStore.f318525b
            if (r2 != r3) goto L44
            boolean r1 = r1.l()
            if (r1 == 0) goto L44
            goto L9e
        L44:
            aN0.a r1 = r5.f325913e
            io.reactivex.rxjava3.subjects.b<com.avito.android.remote.config.ValidateVersionStatus> r2 = r1.f20892a
            java.lang.Object r2 = r2.P0()
            com.avito.android.remote.config.ValidateVersionStatus r2 = (com.avito.android.remote.config.ValidateVersionStatus) r2
            com.avito.android.remote.config.ValidateVersionStatus r3 = com.avito.android.remote.config.ValidateVersionStatus.f253347c
            com.avito.android.P r4 = r5.f325909a
            if (r2 != r3) goto L6f
            r4.getClass()
            kotlin.reflect.n<java.lang.Object>[] r2 = com.avito.android.P.f67370w0
            r3 = 63
            r2 = r2[r3]
            com.avito.android.A0$a r2 = r4.f67393W
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L96
        L6f:
            io.reactivex.rxjava3.subjects.b<com.avito.android.remote.config.ValidateVersionStatus> r1 = r1.f20892a
            java.lang.Object r1 = r1.P0()
            com.avito.android.remote.config.ValidateVersionStatus r1 = (com.avito.android.remote.config.ValidateVersionStatus) r1
            com.avito.android.remote.config.ValidateVersionStatus r2 = com.avito.android.remote.config.ValidateVersionStatus.f253348d
            if (r1 != r2) goto L99
            r4.getClass()
            kotlin.reflect.n<java.lang.Object>[] r1 = com.avito.android.P.f67370w0
            r2 = 64
            r1 = r1[r2]
            com.avito.android.A0$a r1 = r4.f67394X
            DE0.a r1 = r1.a()
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L99
        L96:
            com.avito.android.forceupdate.domain.dto.UpdateSource$SelfUpdate r0 = com.avito.android.forceupdate.domain.dto.UpdateSource.SelfUpdate.f158467b
            goto Lb2
        L99:
            com.avito.android.forceupdate.domain.dto.UpdateSource r0 = e(r0)
            goto Lb2
        L9e:
            com.avito.android.forceupdate.domain.dto.UpdateSource r0 = e(r0)
            goto Lb2
        La3:
            if (r2 == 0) goto Lb0
            java.lang.String r0 = r0.f253329h
            if (r0 == 0) goto Lb0
            com.avito.android.forceupdate.domain.dto.UpdateSource$Custom r1 = new com.avito.android.forceupdate.domain.dto.UpdateSource$Custom
            r1.<init>(r0)
            r0 = r1
            goto Lb2
        Lb0:
            com.avito.android.forceupdate.domain.dto.UpdateSource$Official r0 = com.avito.android.forceupdate.domain.dto.UpdateSource.Official.f158466b
        Lb2:
            return r0
        Lb3:
            com.avito.android.forceupdate.domain.dto.UpdateSource r0 = e(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.version_conflict.j.d():com.avito.android.forceupdate.domain.dto.UpdateSource");
    }

    public final void f(ForceUpdateRootOpenParams forceUpdateRootOpenParams) {
        e eVar = this.f325912d;
        eVar.getClass();
        ForceUpdateRootActivity.f158538x.getClass();
        Intent intentPutExtra = new Intent(eVar.f325898a, (Class<?>) ForceUpdateRootActivity.class).putExtra("open_params", forceUpdateRootOpenParams);
        intentPutExtra.addFlags(268435456);
        this.f325911c.startActivity(intentPutExtra);
    }
}
