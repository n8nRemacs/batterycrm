package y30;

import AK0.l;
import Y61.k;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationStorageImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ly30/e;", "Ly30/d;", "a", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y30.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50051e implements InterfaceC50050d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f442873a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<Gson> f442874b;

    /* compiled from: NotificationStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly30/e$a;", "", "<init>", "()V", "", "KEY_NOTIFICATION_OPEN_AT_TAB", "Ljava/lang/String;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y30.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y30.e$b */
    public static final class b extends com.google.gson.reflect.a<NotificationOpenAtTab> {
    }

    static {
        new a(null);
    }

    @Inject
    public C50051e(@k l lVar, @k h31.e<Gson> eVar) {
        this.f442873a = lVar;
        this.f442874b = eVar;
    }

    @Override // y30.InterfaceC50050d
    public final void a(@k NotificationOpenAtTab notificationOpenAtTab) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
            bVar = this.f442874b.get().l(notificationOpenAtTab);
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        String str = (String) bVar;
        if (str != null) {
            this.f442873a.putString("KEY_NOTIFICATION_OPEN_AT_TAB", str);
        }
    }

    @Override // y30.InterfaceC50050d
    public final void b(@Y61.l kotlin.reflect.d<? extends NotificationOpenAtTab> dVar) {
        kotlin.reflect.d dVarB;
        if (dVar != null) {
            NotificationOpenAtTab notificationOpenAtTabC = c();
            if (notificationOpenAtTabC != null) {
                dVarB = m0.f406844a.b(notificationOpenAtTabC.getClass());
            } else {
                dVarB = null;
            }
            if (!dVar.equals(dVarB)) {
                return;
            }
        }
        this.f442873a.remove("KEY_NOTIFICATION_OPEN_AT_TAB");
    }

    @Y61.l
    public final NotificationOpenAtTab c() {
        Object bVar;
        String string = this.f442873a.getString("KEY_NOTIFICATION_OPEN_AT_TAB");
        if (string == null) {
            return null;
        }
        try {
            int i12 = Z.f406624c;
            Gson gson = this.f442874b.get();
            Type type = new b().getType();
            bVar = (NotificationOpenAtTab) gson.e(string, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        return (NotificationOpenAtTab) (bVar instanceof Z.b ? null : bVar);
    }
}
