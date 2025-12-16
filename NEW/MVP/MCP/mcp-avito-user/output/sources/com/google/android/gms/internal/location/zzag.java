package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.BinderC36677x;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.C36796q;
import com.google.android.gms.location.InterfaceC36780a;
import com.google.android.gms.location.K;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzag extends h implements InterfaceC36780a {
    public static final C36616a zzb = new C36616a("ActivityRecognition.API", new zzad(), new C36616a.g());

    public zzag(Activity activity) {
        super(activity, (C36616a<C36616a.d.C10620d>) zzb, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task<Void> removeActivityTransitionUpdates(final PendingIntent pendingIntent) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C36616a c36616a = zzag.zzb;
                ((zzo) ((zzf) obj).getService()).zzl(pendingIntent2, new BinderC36677x(new zzaf((C37028k) obj2)));
            }
        };
        aVarA.f348955d = 2406;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.location.InterfaceC36780a
    public final Task<Void> removeActivityUpdates(final PendingIntent pendingIntent) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C36616a c36616a = zzag.zzb;
                ((zzf) obj).zzp(pendingIntent2);
                ((C37028k) obj2).b(null);
            }
        };
        aVarA.f348955d = 2402;
        return doWrite(aVarA.a());
    }

    public final Task<Void> removeSleepSegmentUpdates(final PendingIntent pendingIntent) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzab
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                PendingIntent pendingIntent2 = pendingIntent;
                C36616a c36616a = zzag.zzb;
                zzaf zzafVar = new zzaf((C37028k) obj2);
                C36729v.k(pendingIntent2, "PendingIntent must be specified.");
                ((zzo) ((zzf) obj).getService()).zzp(pendingIntent2, new BinderC36677x(zzafVar));
            }
        };
        aVarA.f348955d = 2411;
        return doWrite(aVarA.a());
    }

    public final Task<Void> requestActivityTransitionUpdates(final ActivityTransitionRequest activityTransitionRequest, final PendingIntent pendingIntent) {
        activityTransitionRequest.f354181e = this.f348921b;
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzaa
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ActivityTransitionRequest activityTransitionRequest2 = activityTransitionRequest;
                PendingIntent pendingIntent2 = pendingIntent;
                C36616a c36616a = zzag.zzb;
                zzaf zzafVar = new zzaf((C37028k) obj2);
                C36729v.k(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                C36729v.k(pendingIntent2, "PendingIntent must be specified.");
                ((zzo) ((zzf) obj).getService()).zzq(activityTransitionRequest2, pendingIntent2, new BinderC36677x(zzafVar));
            }
        };
        aVarA.f348955d = 2405;
        return doWrite(aVarA.a());
    }

    @Override // com.google.android.gms.location.InterfaceC36780a
    public final Task<Void> requestActivityUpdates(long j12, final PendingIntent pendingIntent) {
        C36796q c36796q = new C36796q();
        C36729v.a("intervalMillis can't be negative.", j12 >= 0);
        c36796q.f354279a = j12;
        C36729v.l("Must set intervalMillis.", j12 != Long.MIN_VALUE);
        final com.google.android.gms.location.zzb zzbVar = new com.google.android.gms.location.zzb(c36796q.f354279a, true, null, null, null, false, null, 0L, null);
        zzbVar.f354296j = this.f348921b;
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzz
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                com.google.android.gms.location.zzb zzbVar2 = zzbVar;
                PendingIntent pendingIntent2 = pendingIntent;
                C36616a c36616a = zzag.zzb;
                zzaf zzafVar = new zzaf((C37028k) obj2);
                C36729v.k(zzbVar2, "ActivityRecognitionRequest can't be null.");
                C36729v.k(pendingIntent2, "PendingIntent must be specified.");
                ((zzo) ((zzf) obj).getService()).zzs(zzbVar2, pendingIntent2, new BinderC36677x(zzafVar));
            }
        };
        aVarA.f348955d = 2401;
        return doWrite(aVarA.a());
    }

    public final Task<Void> requestSleepSegmentUpdates(final PendingIntent pendingIntent, final SleepSegmentRequest sleepSegmentRequest) {
        C36729v.k(pendingIntent, "PendingIntent must be specified.");
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzac
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzo) ((zzf) obj).getService()).zzt(pendingIntent, sleepSegmentRequest, new zzae((C37028k) obj2));
            }
        };
        aVarA.f348954c = new Feature[]{K.f354203a};
        aVarA.f348955d = 2410;
        return doRead(aVarA.a());
    }

    public zzag(Context context) {
        super(context, (C36616a<C36616a.d.C10620d>) zzb, C36616a.d.f348913j2, h.a.f348930c);
    }
}
