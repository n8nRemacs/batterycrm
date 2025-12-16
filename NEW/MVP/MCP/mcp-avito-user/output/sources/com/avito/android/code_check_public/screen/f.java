package com.avito.android.code_check_public.screen;

import To.d;
import Y41.l;
import com.avito.android.code_check_public.k;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: PhoneRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/screen/f;", "", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class f {

    /* compiled from: PhoneRequest.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "it", "LTo/d;", "invoke", "(Ljava/lang/Object;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Object, To.d> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f119377l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<Object, ? extends To.d> lVar) {
            super(1);
            this.f119377l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final To.d invoke(Object obj) {
            return (To.d) this.f119377l.invoke(obj);
        }
    }

    /* compiled from: PhoneRequest.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "it", "LTo/d;", "invoke", "(Ljava/lang/String;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, To.d> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f119378l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final To.d invoke(String str) {
            return new d.b(com.avito.android.printable_text.b.f(str), null, null, 6, null);
        }
    }

    /* compiled from: PhoneRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "", "", "it", "LTo/d;", "invoke", "(Ljava/util/Map;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Map<String, ? extends String>, To.d> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f119379l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final To.d invoke(Map<String, ? extends String> map) {
            String str = (String) C42745f0.F(map.values());
            if (str != null) {
                return new d.c.b(com.avito.android.printable_text.b.f(str));
            }
            return new d.b(k.a(), null, null, 6, null);
        }
    }

    @Y61.k
    public static To.d a(@Y61.k TypedResult typedResult, @Y61.k l lVar) {
        return (To.d) z.r(typedResult, new a(lVar), b.f119378l, c.f119379l, k.a(), 24);
    }
}
