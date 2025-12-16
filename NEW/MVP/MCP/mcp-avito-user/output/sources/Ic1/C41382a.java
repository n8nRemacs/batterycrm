package ic1;

import G41.i;
import N41.g;
import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.R;
import ic1.d;
import j.InterfaceC42156l;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sberid.sdk.ui.models.root.UIColorMode;
import sc1.o;

@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"SberIdSDK_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ic1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C41382a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Object f398587a = C42727D.b(LazyThreadSafetyMode.f406614b, C11382a.f398588l);

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ic1.a$a, reason: collision with other inner class name */
    public static final class C11382a extends N implements Y41.a<G41.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11382a f398588l = new C11382a();

        public C11382a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [G41.a, java.lang.Object] */
        @Override // Y41.a
        @k
        public final G41.a invoke() {
            if (o.a()) {
                throw new IllegalStateException("Используйте SID.Initializer.initialize(application: Application, clientId: String) для инициализации библиотеки, прежде чем использовать методы.");
            }
            return org.koin.java.c.a(G41.a.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.C] */
    public static final int a(@k Context context, @l @InterfaceC42156l Integer num) {
        int color = androidx.core.content.d.getColor(context, R.color.color_sber_id_button_primary);
        ?? r02 = f398587a;
        Integer num2 = ((g) ((i) ((G41.a) r02.getValue())).f6332c.getValue()).f11196c;
        int iIntValue = num2 != null ? num2.intValue() : color;
        Integer num3 = ((g) ((i) ((G41.a) r02.getValue())).f6332c.getValue()).f11195b;
        int iIntValue2 = num3 != null ? num3.intValue() : color;
        int i12 = ((Context) d.f398589a.getValue()).getResources().getConfiguration().uiMode & 48;
        int i13 = d.a.f398591a[((UIColorMode) ((i) ((G41.a) d.f398590b.getValue())).f6335f.getValue()).ordinal()];
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z12 = false;
            }
        } else if (i12 != 32) {
            z12 = false;
        }
        return num != null ? num.intValue() : z12 ? iIntValue : !z12 ? iIntValue2 : color;
    }
}
