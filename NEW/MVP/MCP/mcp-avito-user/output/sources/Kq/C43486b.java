package kq;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.AbstractC35956u5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: OrderCallView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkq/b;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43486b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f413230a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f413231b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f413232c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<String, G0> f413233d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f413234e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f413235f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f413236g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Input f413237h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f413238i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Button f413239j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final a f413240k;

    /* compiled from: OrderCallView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kq/b$a", "Lcom/avito/android/util/u5;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kq.b$a */
    public static final class a extends AbstractC35956u5 {
        public a() {
        }

        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
            C43486b.this.f413233d.invoke(charSequence.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43486b(@k View view, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k l<? super DeepLink, G0> lVar, @k l<? super String, G0> lVar2) {
        this.f413230a = aVar;
        this.f413231b = aVar2;
        this.f413232c = lVar;
        this.f413233d = lVar2;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f413234e = (TextView) view.findViewById(R.id.title);
        this.f413235f = (TextView) view.findViewById(R.id.subtitle);
        this.f413236g = (TextView) view.findViewById(R.id.text_icon);
        Input input = (Input) view.findViewById(R.id.input_phone);
        this.f413237h = input;
        TextView textView = (TextView) view.findViewById(R.id.hint);
        this.f413238i = textView;
        Button button = (Button) view.findViewById(R.id.button_proceed);
        this.f413239j = button;
        a aVar3 = new a();
        this.f413240k = aVar3;
        input.b(aVar3);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: kq.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C43486b f413229c;

            {
                this.f413229c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f413229c.f413230a.invoke();
                        break;
                    default:
                        this.f413229c.f413231b.invoke();
                        break;
                }
            }
        });
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: kq.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C43486b f413229c;

            {
                this.f413229c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f413229c.f413230a.invoke();
                        break;
                    default:
                        this.f413229c.f413231b.invoke();
                        break;
                }
            }
        });
        Input.f179303W.getClass();
        input.setState(Input.f179304a0);
    }
}
