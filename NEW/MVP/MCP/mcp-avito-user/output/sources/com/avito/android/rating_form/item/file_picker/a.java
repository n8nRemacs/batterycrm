package com.avito.android.rating_form.item.file_picker;

import android.content.Context;
import android.text.format.Formatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.rating_form.item.file_picker.a;
import com.avito.android.rating_form.step.z;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;

/* compiled from: RatingFormFileAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/item/file_picker/a;", "Landroidx/recyclerview/widget/B;", "Lcom/avito/android/rating_form/step/e;", "Lcom/avito/android/rating_form/item/file_picker/a$b;", "<init>", "()V", "b", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends B<com.avito.android.rating_form.step.e, b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public i f248410e;

    /* compiled from: RatingFormFileAdapter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/android/rating_form/item/file_picker/a$a", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/rating_form/step/e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_form.item.file_picker.a$a, reason: collision with other inner class name */
    public static final class C7469a extends C23424o.f<com.avito.android.rating_form.step.e> {
        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(com.avito.android.rating_form.step.e eVar, com.avito.android.rating_form.step.e eVar2) {
            return eVar.equals(eVar2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(com.avito.android.rating_form.step.e eVar, com.avito.android.rating_form.step.e eVar2) {
            return eVar.f249467a == eVar2.f249467a;
        }
    }

    /* compiled from: RatingFormFileAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/file_picker/a$b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends RecyclerView.C {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int f248411j = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Context f248412b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f248413c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f248414d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final TextView f248415e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ProgressBarRe23 f248416f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final TextView f248417g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final TextView f248418h;

        public b(@Y61.k View view) {
            super(view);
            this.f248412b = view.getContext();
            this.f248413c = (TextView) view.findViewById(R.id.rating_form_file_picker_title);
            this.f248414d = (TextView) view.findViewById(R.id.rating_form_file_picker_subtitle);
            this.f248415e = (TextView) view.findViewById(R.id.rating_form_file_picker_percent);
            this.f248416f = (ProgressBarRe23) view.findViewById(R.id.rating_form_file_picker_progress_bar);
            TextView textView = (TextView) view.findViewById(R.id.rating_form_file_picker_delete_icon);
            this.f248417g = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.rating_form_file_picker_repeat_icon);
            this.f248418h = textView2;
            TextView textView3 = (TextView) view.findViewById(R.id.rating_form_file_picker_file_icon);
            FV.a.f4720a.getClass();
            FV.a.c(textView, R.attr.textIconDelete);
            FV.a.c(textView2, R.attr.textIconRepeat);
            FV.a.c(textView3, R.attr.textIconFile);
        }
    }

    public a() {
        super(new C7469a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        final int i13 = 1;
        final int i14 = 0;
        b bVar = (b) c12;
        final com.avito.android.rating_form.step.e item = getItem(i12);
        bVar.f248413c.setText(item.f249469c);
        Context context = bVar.f248412b;
        Long l12 = item.f249470d;
        String shortFileSize = l12 != null ? Formatter.formatShortFileSize(context, l12.longValue()) : null;
        TextView textView = bVar.f248414d;
        I5.a(textView, shortFileSize, false);
        final a aVar = a.this;
        View.OnClickListener onClickListener = new View.OnClickListener(aVar) { // from class: com.avito.android.rating_form.item.file_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f248421c;

            {
                this.f248421c = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.avito.android.rating_form.step.e eVar = item;
                a aVar2 = this.f248421c;
                switch (i14) {
                    case 0:
                        int i15 = a.b.f248411j;
                        i iVar = aVar2.f248410e;
                        if (iVar != null) {
                            j jVar = iVar.f248432a;
                            jVar.f248434b.b(iVar.f248433b.f248428c, eVar);
                            break;
                        }
                        break;
                    default:
                        int i16 = a.b.f248411j;
                        i iVar2 = aVar2.f248410e;
                        if (iVar2 != null) {
                            j jVar2 = iVar2.f248432a;
                            jVar2.f248434b.a(iVar2.f248433b.f248428c, eVar);
                            break;
                        }
                        break;
                }
            }
        };
        TextView textView2 = bVar.f248417g;
        textView2.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener(aVar) { // from class: com.avito.android.rating_form.item.file_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f248421c;

            {
                this.f248421c = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.avito.android.rating_form.step.e eVar = item;
                a aVar2 = this.f248421c;
                switch (i13) {
                    case 0:
                        int i15 = a.b.f248411j;
                        i iVar = aVar2.f248410e;
                        if (iVar != null) {
                            j jVar = iVar.f248432a;
                            jVar.f248434b.b(iVar.f248433b.f248428c, eVar);
                            break;
                        }
                        break;
                    default:
                        int i16 = a.b.f248411j;
                        i iVar2 = aVar2.f248410e;
                        if (iVar2 != null) {
                            j jVar2 = iVar2.f248432a;
                            jVar2.f248434b.a(iVar2.f248433b.f248428c, eVar);
                            break;
                        }
                        break;
                }
            }
        };
        TextView textView3 = bVar.f248418h;
        textView3.setOnClickListener(onClickListener2);
        z zVar = item.f249471e;
        boolean z12 = zVar instanceof z.c;
        TextView textView4 = bVar.f248415e;
        ProgressBarRe23 progressBarRe23 = bVar.f248416f;
        if (z12) {
            D6.H(progressBarRe23);
            z.c cVar = (z.c) zVar;
            progressBarRe23.setProgress(cVar.f249766a);
            D6.H(textView2);
            D6.w(textView3);
            u0 u0Var = u0.f406856a;
            I5.a(textView4, String.format("%.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(cVar.f249766a * 100)}, 1)), false);
            textView.setTextColor(C35835l0.d(R.attr.gray54, context));
            return;
        }
        if (zVar instanceof z.b) {
            D6.H(textView2);
            D6.g(progressBarRe23);
            D6.w(textView3);
            D6.w(textView4);
            textView.setTextColor(C35835l0.d(R.attr.gray54, context));
            return;
        }
        if (zVar instanceof z.a) {
            D6.H(textView2);
            D6.g(progressBarRe23);
            if (item.f249468b != null) {
                D6.H(textView3);
            }
            D6.w(textView4);
            D6.H(textView);
            textView.setTextColor(C35835l0.d(R.attr.red600, context));
            textView.setText(((z.a) zVar).f249764a.Y4(context));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new b(C0.b(viewGroup, R.layout.rating_form_file_item, viewGroup, false));
    }
}
