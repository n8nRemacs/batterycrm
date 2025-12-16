package nZ;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import rZ.InterfaceC47619a;

/* compiled from: PrefUnreadMessengerCounterStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LnZ/a;", "LrZ/a;", "a", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nZ.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44354a implements InterfaceC47619a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f415173b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f415174a;

    /* compiled from: PrefUnreadMessengerCounterStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LnZ/a$a;", "", "<init>", "()V", "", "PREFIX", "Ljava/lang/String;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nZ.a$a, reason: collision with other inner class name */
    public static final class C11861a {
        public /* synthetic */ C11861a(C42822w c42822w) {
            this();
        }

        public C11861a() {
        }
    }

    static {
        new C11861a(null);
        f415173b = "messenger_unread_messages_count_1";
    }

    @Inject
    public C44354a(@k l lVar) {
        this.f415174a = lVar;
    }

    @Override // rZ.InterfaceC47619a
    public final int a() {
        return this.f415174a.getInt(f415173b, 0);
    }

    @Override // rZ.InterfaceC47619a
    public final void b(int i12) {
        this.f415174a.a(i12, f415173b);
    }

    @Override // rZ.InterfaceC47619a
    public final void clear() {
        b(0);
    }
}
