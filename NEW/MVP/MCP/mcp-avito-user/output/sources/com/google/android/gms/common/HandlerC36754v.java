package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class HandlerC36754v extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f349621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C36687f f349622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC36754v(C36687f c36687f, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f349622b = c36687f;
        this.f349621a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        if (message.what != 1) {
            return;
        }
        int i12 = C36688g.f349288a;
        C36687f c36687f = this.f349622b;
        Context context = this.f349621a;
        int iC2 = c36687f.c(i12, context);
        AtomicBoolean atomicBoolean = C36690i.f349291a;
        if (iC2 == 1 || iC2 == 2 || iC2 == 3 || iC2 == 9) {
            Intent intentB = c36687f.b(context, iC2, "n");
            c36687f.i(context, iC2, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, zzd.zza | 134217728));
        }
    }
}
