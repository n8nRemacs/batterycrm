package com.avito.android.messenger.input;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.Editable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.messenger.input.MessageInput;
import com.avito.android.util.AbstractC35956u5;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.jakewharton.rxbinding4.view.C37722i;
import com.jakewharton.rxbinding4.widget.C37750f0;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.o;

/* compiled from: MessageInput.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/input/b;", "Lcom/avito/android/util/u5;", "Lcom/avito/android/messenger/input/MessageInput;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
@InterfaceC41177b
/* loaded from: classes15.dex */
final class b extends AbstractC35956u5 implements MessageInput {

    /* renamed from: A, reason: collision with root package name */
    @k
    public final z<G0> f196387A;

    /* renamed from: B, reason: collision with root package name */
    @k
    public final z<G0> f196388B;

    /* renamed from: C, reason: collision with root package name */
    @k
    public final B0 f196389C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f196390D;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f196391b;

    /* renamed from: c, reason: collision with root package name */
    public final View f196392c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f196393d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f196394e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewAnimator f196395f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final EditText f196396g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Input f196397h;

    /* renamed from: i, reason: collision with root package name */
    public final View f196398i;

    /* renamed from: j, reason: collision with root package name */
    public final View f196399j;

    /* renamed from: k, reason: collision with root package name */
    public final View f196400k;

    /* renamed from: l, reason: collision with root package name */
    public final View f196401l;

    /* renamed from: m, reason: collision with root package name */
    public final View f196402m;

    /* renamed from: n, reason: collision with root package name */
    public final View f196403n;

    /* renamed from: o, reason: collision with root package name */
    public final View f196404o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f196405p;

    /* renamed from: q, reason: collision with root package name */
    public final View f196406q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final TypedValue f196407r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final TypedValue f196408s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final z<G0> f196409t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final z<G0> f196410u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final z<G0> f196411v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final z<G0> f196412w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final z<G0> f196413x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final z<CharSequence> f196414y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final z<G0> f196415z;

    /* compiled from: MessageInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MessageInput.AttachButtonState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MessageInput.AttachButtonState attachButtonState = MessageInput.AttachButtonState.f196375b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MessageInput.AttachButtonState attachButtonState2 = MessageInput.AttachButtonState.f196375b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MessageInput.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "apply", "(Lkotlin/G0;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.input.b$b, reason: collision with other inner class name */
    public static final class C5777b<T, R> implements o {
        public C5777b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Editable editableM53getText;
            b bVar = b.this;
            EditText editText = bVar.f196396g;
            if (editText == null || (editableM53getText = editText.getText()) == null) {
                Input input = bVar.f196397h;
                editableM53getText = input != null ? input.m53getText() : null;
            }
            return String.valueOf(editableM53getText);
        }
    }

    public b(@k View view, boolean z12) throws Resources.NotFoundException {
        this.f196391b = view;
        View viewFindViewById = view.findViewById(R.id.attachment_button);
        this.f196392c = viewFindViewById;
        ImageView imageView = (ImageView) view.findViewById(R.id.submit_button);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.photo_button);
        this.f196393d = imageView2;
        ImageView imageView3 = (ImageView) view.findViewById(R.id.quick_reply_button);
        this.f196394e = imageView3;
        this.f196395f = (ViewAnimator) view.findViewById(R.id.submit_button_animator);
        EditText editText = (EditText) view.findViewById(R.id.message);
        this.f196396g = editText;
        Input input = (Input) view.findViewById(R.id.message_input);
        this.f196397h = input;
        View viewFindViewById2 = view.findViewById(R.id.speaker_button);
        this.f196398i = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.support_button);
        this.f196399j = viewFindViewById3;
        this.f196400k = view.findViewById(R.id.voice_message_input_field);
        this.f196401l = view.findViewById(R.id.message_input_field);
        View viewFindViewById4 = view.findViewById(R.id.remove_voice_button);
        this.f196402m = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.decline_voice_button);
        this.f196403n = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.send_voice_button);
        this.f196404o = viewFindViewById6;
        this.f196405p = (TextView) view.findViewById(R.id.recording_progress_title);
        this.f196406q = view.findViewById(R.id.recording_voice_dot);
        TypedValue typedValue = new TypedValue();
        this.f196407r = typedValue;
        TypedValue typedValue2 = new TypedValue();
        this.f196408s = typedValue2;
        this.f196409t = C37722i.a(imageView2);
        this.f196410u = C37722i.a(imageView3);
        this.f196411v = C37722i.a(viewFindViewById3);
        this.f196412w = C37722i.a(viewFindViewById);
        this.f196413x = C37722i.a(viewFindViewById2);
        this.f196414y = editText != null ? C37750f0.c(editText) : input != null ? n.e(input) : U.f403867b;
        this.f196415z = C37722i.a(viewFindViewById6);
        this.f196387A = C37722i.a(viewFindViewById4);
        this.f196388B = C37722i.a(viewFindViewById5);
        this.f196389C = C37722i.a(imageView).d0(new C5777b());
        this.f196390D = new com.jakewharton.rxrelay3.c();
        view.getResources().getValue(R.dimen.active_alpha, typedValue, true);
        view.getResources().getValue(R.dimen.inactive_alpha, typedValue2, true);
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        if (input != null) {
            input.b(this);
        }
        if (z12 && input != null) {
            input.setInputType(147457);
        }
        if (editText != null) {
            final int i12 = 0;
            editText.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.messenger.input.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f196386c;

                {
                    this.f196386c = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i12) {
                        case 0:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        case 1:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        case 2:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        case 3:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        default:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                    }
                    return false;
                }
            });
        }
        if (input != null) {
            final int i13 = 1;
            input.setTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.messenger.input.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f196386c;

                {
                    this.f196386c = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    switch (i13) {
                        case 0:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        case 1:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        case 2:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        case 3:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                        default:
                            if (motionEvent.getActionMasked() == 0) {
                                this.f196386c.f196390D.accept(G0.f406611a);
                                break;
                            }
                            break;
                    }
                    return false;
                }
            });
        }
        final int i14 = 2;
        viewFindViewById.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.messenger.input.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f196386c;

            {
                this.f196386c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                switch (i14) {
                    case 0:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 1:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 2:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 3:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    default:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        final int i15 = 3;
        imageView.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.messenger.input.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f196386c;

            {
                this.f196386c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                switch (i15) {
                    case 0:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 1:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 2:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 3:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    default:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        final int i16 = 4;
        imageView2.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.avito.android.messenger.input.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f196386c;

            {
                this.f196386c = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                switch (i16) {
                    case 0:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 1:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 2:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    case 3:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                    default:
                        if (motionEvent.getActionMasked() == 0) {
                            this.f196386c.f196390D.accept(G0.f406611a);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void W() {
        EditText editText = this.f196396g;
        if (editText != null) {
            K2.d(editText, true);
        }
        Input input = this.f196397h;
        if (input != null) {
            K2.d(input, true);
        }
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> a() {
        return this.f196409t;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void b(boolean z12) {
        D6.G(this.f196399j, z12);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void c() {
        D6.G(this.f196401l, true);
        D6.w(this.f196400k);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void d(@k String str, boolean z12) {
        D6.w(this.f196401l);
        D6.G(this.f196400k, true);
        TextView textView = this.f196405p;
        View view = this.f196406q;
        View view2 = this.f196403n;
        View view3 = this.f196402m;
        if (z12) {
            D6.G(view3, true);
            D6.w(view2);
            D6.w(view);
            textView.setText(this.f196391b.getContext().getString(R.string.messenger_item_price_with_separator, str));
            return;
        }
        D6.w(view3);
        D6.G(view2, true);
        D6.G(view, true);
        textView.setText(str);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void e(boolean z12) {
        D6.G(this.f196393d, z12);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> f() {
        return this.f196412w;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    /* renamed from: g, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF196390D() {
        return this.f196390D;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> h() {
        return this.f196413x;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void hide() {
        EditText editText = this.f196396g;
        if (editText != null) {
            K2.d(editText, true);
        }
        Input input = this.f196397h;
        if (input != null) {
            K2.d(input, true);
        }
        D6.w(this.f196391b);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> i() {
        return this.f196410u;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void i0() {
        EditText editText = this.f196396g;
        if (editText != null) {
            K2.i(editText);
        }
        Input input = this.f196397h;
        if (input != null) {
            input.v();
        }
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void j(boolean z12) {
        D6.G(this.f196394e, z12);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> k() {
        return this.f196388B;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void l(boolean z12) {
        D6.G(this.f196398i, z12);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void m(boolean z12) {
        ImageView imageView = this.f196393d;
        if (z12) {
            imageView.setTag(MessageInput.SendPhotoButtonState.f196380b);
        } else {
            imageView.setTag(MessageInput.SendPhotoButtonState.f196381c);
        }
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    /* renamed from: n, reason: from getter */
    public final B0 getF196389C() {
        return this.f196389C;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void o(boolean z12, @k CharSequence charSequence) {
        CharSequence charSequenceS0 = C43066x.s0(this.f196391b.getResources().getInteger(R.integer.messenger_max_message_length), charSequence);
        EditText editText = this.f196396g;
        if (editText != null) {
            editText.setText(charSequenceS0);
        }
        if (editText != null) {
            editText.setSelection(charSequenceS0.length());
        }
        Input input = this.f196397h;
        if (input != null) {
            Input.t(input, charSequenceS0, false, 6);
        }
        if (input != null) {
            input.setSelection(charSequenceS0.length());
        }
        if (z12) {
            i0();
        }
    }

    @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
    public final void onTextChanged(@k CharSequence charSequence, int i12, int i13, int i14) {
        boolean zK2 = C43066x.K(charSequence);
        ViewAnimator viewAnimator = this.f196395f;
        if (zK2) {
            if (viewAnimator.getDisplayedChild() != 0) {
                viewAnimator.setDisplayedChild(0);
            }
        } else if (1 != viewAnimator.getDisplayedChild()) {
            viewAnimator.setDisplayedChild(1);
        }
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<CharSequence> p() {
        return this.f196414y;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> q() {
        return this.f196411v;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void r(@k MessageInput.AttachButtonState attachButtonState) {
        int iOrdinal = attachButtonState.ordinal();
        View view = this.f196392c;
        if (iOrdinal == 0) {
            D6.H(view);
            view.setAlpha(this.f196407r.getFloat());
            view.setClickable(true);
            G0 g02 = G0.f406611a;
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            D6.w(view);
            G0 g03 = G0.f406611a;
            return;
        }
        D6.H(view);
        view.setAlpha(this.f196408s.getFloat());
        view.setClickable(false);
        G0 g04 = G0.f406611a;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void s() {
        EditText editText = this.f196396g;
        if (editText != null) {
            editText.setText((CharSequence) null);
        }
        Input input = this.f196397h;
        if (input != null) {
            Input.t(input, null, false, 6);
        }
    }

    @Override // com.avito.android.messenger.input.MessageInput
    public final void show() {
        D6.H(this.f196391b);
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> t() {
        return this.f196387A;
    }

    @Override // com.avito.android.messenger.input.MessageInput
    @k
    public final z<G0> u() {
        return this.f196415z;
    }
}
