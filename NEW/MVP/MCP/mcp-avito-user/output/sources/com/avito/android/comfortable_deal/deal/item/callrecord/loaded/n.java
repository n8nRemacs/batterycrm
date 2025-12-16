package com.avito.android.comfortable_deal.deal.item.callrecord.loaded;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CallRecordView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/callrecord/loaded/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/callrecord/loaded/l;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f121241b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f121242c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SeekBar f121243d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f121244e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f121245f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f121246g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f121247h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f121248i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public N f121249j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public N f121250k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f121251l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f121252m;

    /* renamed from: n, reason: collision with root package name */
    public final DateTimeFormatter f121253n;

    /* compiled from: CallRecordView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal/deal/item/callrecord/loaded/n$a", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public Integer f121254b;

        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(@Y61.l SeekBar seekBar, int i12, boolean z12) {
            if (z12) {
                this.f121254b = Integer.valueOf(i12);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(@Y61.l SeekBar seekBar) {
            n.this.f121252m = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(@Y61.l SeekBar seekBar) {
            Integer num = this.f121254b;
            n nVar = n.this;
            if (num != null) {
                int iIntValue = num.intValue();
                Y41.l<? super Integer, G0> lVar = nVar.f121251l;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(iIntValue));
                }
            }
            nVar.f121252m = false;
        }
    }

    public n(@Y61.k View view) {
        super(view);
        this.f121241b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.play_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        this.f121242c = button;
        View viewFindViewById2 = view.findViewById(R.id.call_duration_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.SeekBar");
        }
        SeekBar seekBar = (SeekBar) viewFindViewById2;
        this.f121243d = seekBar;
        View viewFindViewById3 = view.findViewById(R.id.ic_expand);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.speed_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        this.f121244e = textView;
        View viewFindViewById5 = view.findViewById(R.id.time_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f121245f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.author_text);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f121246g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.date_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f121247h = (TextView) viewFindViewById7;
        this.f121253n = DateTimeFormatter.ofPattern("d MMMM HH:mm");
        final int i12 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.callrecord.loaded.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f121240c;

            {
                this.f121240c = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v5, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v7, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        ?? r12 = this.f121240c.f121249j;
                        if (r12 != 0) {
                            r12.invoke();
                            break;
                        }
                        break;
                    case 1:
                        ?? r13 = this.f121240c.f121249j;
                        if (r13 != 0) {
                            r13.invoke();
                            break;
                        }
                        break;
                    default:
                        ?? r14 = this.f121240c.f121250k;
                        if (r14 != 0) {
                            r14.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.callrecord.loaded.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f121240c;

            {
                this.f121240c = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v5, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v7, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        ?? r12 = this.f121240c.f121249j;
                        if (r12 != 0) {
                            r12.invoke();
                            break;
                        }
                        break;
                    case 1:
                        ?? r13 = this.f121240c.f121249j;
                        if (r13 != 0) {
                            r13.invoke();
                            break;
                        }
                        break;
                    default:
                        ?? r14 = this.f121240c.f121250k;
                        if (r14 != 0) {
                            r14.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.deal.item.callrecord.loaded.m

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f121240c;

            {
                this.f121240c = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v5, types: [Y41.a, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v7, types: [Y41.a, kotlin.jvm.internal.N] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        ?? r12 = this.f121240c.f121249j;
                        if (r12 != 0) {
                            r12.invoke();
                            break;
                        }
                        break;
                    case 1:
                        ?? r13 = this.f121240c.f121249j;
                        if (r13 != 0) {
                            r13.invoke();
                            break;
                        }
                        break;
                    default:
                        ?? r14 = this.f121240c.f121250k;
                        if (r14 != 0) {
                            r14.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        seekBar.setOnSeekBarChangeListener(new a());
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void AL(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f121251l = lVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void Cn(@Y61.k String str) {
        this.f121245f.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void Lj(@Y61.k Y41.a<G0> aVar) {
        this.f121250k = (N) aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void Po(@Y61.k PlaySpeed playSpeed) {
        this.f121244e.setText(playSpeed.f121206c.format(Float.valueOf(playSpeed.f121205b)).replace('.', ',').concat("x"));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void TK(int i12) {
        if (this.f121252m) {
            return;
        }
        this.f121243d.setProgress(i12);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void U2(@Y61.k Y41.a<G0> aVar) {
        this.f121248i = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void eg(@Y61.k Y41.a<G0> aVar) {
        this.f121249j = (N) aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f121248i;
        if (aVar != null) {
            ((f) aVar).invoke();
        }
        this.f121248i = null;
        this.f121249j = null;
        this.f121250k = null;
        this.f121251l = null;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void oU(@Y61.k PrintableText printableText) {
        this.f121246g.setText(printableText.k0(this.f121241b));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void og(boolean z12) {
        int i12 = !z12 ? R.attr.ic_play24 : R.attr.ic_pause24;
        Button button = this.f121242c;
        button.setImageDrawable(C35835l0.h(i12, button.getContext()));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.callrecord.loaded.l
    public final void sy(@Y61.k LocalDateTime localDateTime) {
        this.f121247h.setText(this.f121253n.format(localDateTime));
    }
}
