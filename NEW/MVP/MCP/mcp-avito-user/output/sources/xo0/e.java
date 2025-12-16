package XO0;

import VO0.b;
import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.wallet.page.history.remote.dto.PaymentOrderStatus;
import com.google.android.material.shape.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49528c;

/* compiled from: OperationViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXO0/e;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends RecyclerView.C {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f18873i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f18874b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<b.d, G0> f18875c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f18876d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f18877e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f18878f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f18879g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f18880h;

    /* compiled from: OperationViewHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXO0/e$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OperationViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18881a;

        static {
            int[] iArr = new int[PaymentOrderStatus.values().length];
            try {
                iArr[PaymentOrderStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentOrderStatus.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentOrderStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentOrderStatus.DONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18881a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k View view, @k l<? super b.d, G0> lVar) {
        super(view);
        this.f18874b = view;
        this.f18875c = lVar;
        View viewFindViewById = view.findViewById(R.id.payment_operation_amount);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f18876d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.payment_operation_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f18877e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.payment_operation_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f18878f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.payment_operation_date);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f18879g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.payment_operation_status);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f18880h = (TextView) viewFindViewById5;
        view.setClickable(true);
        view.setFocusable(true);
        AbstractC49528c.a aVar = AbstractC49528c.f441377b;
        aVar.getClass();
        q.b bVar = new q.b();
        com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a(0.0f);
        bVar.f357097e = aVar2;
        bVar.f357098f = aVar2;
        bVar.f357099g = aVar2;
        bVar.f357100h = aVar2;
        view.setBackground(AbstractC49528c.a.b(aVar, bVar.a(), 0, 0, 0, 0, C35835l0.e(R.attr.white, view.getContext()), C35835l0.e(R.attr.warmGray4, view.getContext()), null, null, 414));
    }
}
