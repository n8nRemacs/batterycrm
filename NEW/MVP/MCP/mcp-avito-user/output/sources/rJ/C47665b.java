package rj;

import Y61.k;
import com.avito.android.beduin_shared.model.socket_event.BeduinSocketEventParser;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import mx0.e;
import vj.C49337a;

/* compiled from: BeduinSocketEventMappingModule_ProvideBeduinSocketEventMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lrj/b;", "Ldagger/internal/h;", "Lmx0/c;", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C47665b implements h<mx0.c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f430153b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C47667d f430154a;

    /* compiled from: BeduinSocketEventMappingModule_ProvideBeduinSocketEventMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrj/b$a;", "", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rj.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47665b(@k C47664a c47664a, @k C47667d c47667d) {
        this.f430154a = c47667d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f430154a.getClass();
        BeduinSocketEventParser beduinSocketEventParser = new BeduinSocketEventParser();
        f430153b.getClass();
        return new mx0.c(C49337a.class, new e("beduin_v1.socket_event", null, false, 6, null), beduinSocketEventParser);
    }
}
