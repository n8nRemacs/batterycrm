package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import androidx.collection.C20199a;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.api.internal.C36648i1;
import com.google.android.gms.common.api.internal.InterfaceC36637f;
import com.google.android.gms.common.api.internal.InterfaceC36664q;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@Deprecated
/* loaded from: classes6.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC25600a
    public static final Set f348935a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Deprecated
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public final String f348938c;

        /* renamed from: d, reason: collision with root package name */
        public final String f348939d;

        /* renamed from: f, reason: collision with root package name */
        public final Context f348941f;

        /* renamed from: i, reason: collision with root package name */
        public final Looper f348944i;

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f348936a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f348937b = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        public final C20199a f348940e = new C20199a();

        /* renamed from: g, reason: collision with root package name */
        public final C20199a f348942g = new C20199a();

        /* renamed from: h, reason: collision with root package name */
        public final int f348943h = -1;

        /* renamed from: j, reason: collision with root package name */
        public final C36687f f348945j = C36687f.f349287e;

        /* renamed from: k, reason: collision with root package name */
        public final C36616a.AbstractC10618a f348946k = com.google.android.gms.signin.e.f355599a;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList f348947l = new ArrayList();

        /* renamed from: m, reason: collision with root package name */
        public final ArrayList f348948m = new ArrayList();

        public a(@N Context context) {
            this.f348941f = context;
            this.f348944i = context.getMainLooper();
            this.f348938c = context.getPackageName();
            this.f348939d = context.getClass().getName();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Deprecated
    public interface b extends InterfaceC36637f {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @Deprecated
    public interface c extends InterfaceC36664q {
    }

    public abstract void d();

    public abstract void e();

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public <A extends C36616a.b, R extends r, T extends C36634e.a<R, A>> T f(@N T t12) {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public <A extends C36616a.b, T extends C36634e.a<? extends r, A>> T g(@N T t12) {
        throw new UnsupportedOperationException();
    }

    @N
    @RX0.a
    public C36616a.f h(@N C36616a.g gVar) {
        throw new UnsupportedOperationException();
    }

    @N
    @RX0.a
    public Looper i() {
        throw new UnsupportedOperationException();
    }

    @RX0.a
    public boolean j(@N com.google.android.gms.auth.api.signin.internal.f fVar) {
        throw new UnsupportedOperationException();
    }

    @RX0.a
    public void k() {
        throw new UnsupportedOperationException();
    }

    public void l(C36648i1 c36648i1) {
        throw new UnsupportedOperationException();
    }

    public void m(C36648i1 c36648i1) {
        throw new UnsupportedOperationException();
    }
}
