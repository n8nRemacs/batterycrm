package com.avito.android.update_source;

import AK0.i;
import AK0.l;
import Y61.k;
import android.content.Context;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: UpdateSourcePreferences.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/update_source/c;", "", "a", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f306703a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f306704b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f306705c = C42727D.c(new b());

    /* compiled from: UpdateSourcePreferences.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/update_source/c$a;", "", "<init>", "()V", "", "KEY_UPDATE_SOURCE_LAST_UPDATED_VERSION_CODE", "Ljava/lang/String;", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UpdateSourcePreferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LAK0/l;", "invoke", "()LAK0/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<l> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            c cVar = c.this;
            return cVar.f306704b.a(cVar.f306703a, "update_source");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k Context context, @k i iVar) {
        this.f306703a = context;
        this.f306704b = iVar;
    }
}
