package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.api.internal.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36634e {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.internal.e$a */
    public static abstract class a<R extends com.google.android.gms.common.api.r, A extends C36616a.b> extends BasePendingResult<R> implements b<R> {

        /* renamed from: p, reason: collision with root package name */
        @RX0.a
        public final C36616a.g f349111p;

        /* renamed from: q, reason: collision with root package name */
        @RX0.a
        @j.P
        public final C36616a<?> f349112q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RX0.a
        public a(@j.N C36616a<?> c36616a, @j.N com.google.android.gms.common.api.i iVar) {
            super(iVar);
            C36729v.k(iVar, "GoogleApiClient must not be null");
            C36729v.k(c36616a, "Api must not be null");
            this.f349111p = c36616a.f348911b;
            this.f349112q = c36616a;
        }

        @RX0.a
        public abstract void c(@j.N A a12);

        @RX0.a
        @j.P
        public final C36616a<?> getApi() {
            return this.f349112q;
        }

        @j.N
        @RX0.a
        public final C36616a.c<A> getClientKey() {
            return this.f349111p;
        }

        @RX0.a
        public final void run(@j.N A a12) throws DeadObjectException {
            try {
                c(a12);
            } catch (DeadObjectException e12) {
                setFailedResult(new Status(8, e12.getLocalizedMessage(), null, null));
                throw e12;
            } catch (RemoteException e13) {
                setFailedResult(new Status(8, e13.getLocalizedMessage(), null, null));
            }
        }

        @Override // com.google.android.gms.common.api.internal.C36634e.b
        @RX0.a
        public final void setFailedResult(@j.N Status status) {
            C36729v.a("Failed result must not be success", !status.h());
            setResult((a<R, A>) createFailedResult(status));
        }

        @RX0.a
        public /* bridge */ /* synthetic */ void setResult(@j.N Object obj) {
            setResult((a<R, A>) obj);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.api.internal.e$b */
    public interface b<R> {
        @RX0.a
        void setFailedResult(@j.N Status status);

        @RX0.a
        void setResult(@j.N R r12);
    }
}
