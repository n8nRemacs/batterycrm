package com.avito.android.edit_address.adapter.schedule;

import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import jy.InterfaceC42447e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ScheduleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_address/adapter/schedule/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/edit_address/adapter/schedule/i;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f145814b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f145815c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f145816d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f145817e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f145818f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f145819g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f145820h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public e f145821i;

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.edit_address_remove_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById;
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_address.adapter.schedule.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f145813c;

            {
                this.f145813c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        e eVar = this.f145813c.f145821i;
                        if (eVar != null) {
                            eVar.f145809b.K5(new InterfaceC42447e.C11594e(eVar.f145808a));
                            break;
                        }
                        break;
                    case 1:
                        e eVar2 = this.f145813c.f145821i;
                        if (eVar2 != null) {
                            eVar2.f145809b.K5(new InterfaceC42447e.f(eVar2.f145808a));
                            break;
                        }
                        break;
                    case 2:
                        e eVar3 = this.f145813c.f145821i;
                        if (eVar3 != null) {
                            eVar3.f145809b.K5(new InterfaceC42447e.g(eVar3.f145808a));
                            break;
                        }
                        break;
                    default:
                        e eVar4 = this.f145813c.f145821i;
                        if (eVar4 != null) {
                            eVar4.f145809b.K5(new InterfaceC42447e.b(eVar4.f145808a));
                            break;
                        }
                        break;
                }
            }
        });
        this.f145814b = button;
        View viewFindViewById2 = view.findViewById(R.id.edit_address_schedule_work_days);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        final int i13 = 1;
        input.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_address.adapter.schedule.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f145813c;

            {
                this.f145813c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        e eVar = this.f145813c.f145821i;
                        if (eVar != null) {
                            eVar.f145809b.K5(new InterfaceC42447e.C11594e(eVar.f145808a));
                            break;
                        }
                        break;
                    case 1:
                        e eVar2 = this.f145813c.f145821i;
                        if (eVar2 != null) {
                            eVar2.f145809b.K5(new InterfaceC42447e.f(eVar2.f145808a));
                            break;
                        }
                        break;
                    case 2:
                        e eVar3 = this.f145813c.f145821i;
                        if (eVar3 != null) {
                            eVar3.f145809b.K5(new InterfaceC42447e.g(eVar3.f145808a));
                            break;
                        }
                        break;
                    default:
                        e eVar4 = this.f145813c.f145821i;
                        if (eVar4 != null) {
                            eVar4.f145809b.K5(new InterfaceC42447e.b(eVar4.f145808a));
                            break;
                        }
                        break;
                }
            }
        });
        this.f145815c = input;
        View viewFindViewById3 = view.findViewById(R.id.edit_address_schedule_work_time);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById3;
        final int i14 = 2;
        input2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_address.adapter.schedule.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f145813c;

            {
                this.f145813c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        e eVar = this.f145813c.f145821i;
                        if (eVar != null) {
                            eVar.f145809b.K5(new InterfaceC42447e.C11594e(eVar.f145808a));
                            break;
                        }
                        break;
                    case 1:
                        e eVar2 = this.f145813c.f145821i;
                        if (eVar2 != null) {
                            eVar2.f145809b.K5(new InterfaceC42447e.f(eVar2.f145808a));
                            break;
                        }
                        break;
                    case 2:
                        e eVar3 = this.f145813c.f145821i;
                        if (eVar3 != null) {
                            eVar3.f145809b.K5(new InterfaceC42447e.g(eVar3.f145808a));
                            break;
                        }
                        break;
                    default:
                        e eVar4 = this.f145813c.f145821i;
                        if (eVar4 != null) {
                            eVar4.f145809b.K5(new InterfaceC42447e.b(eVar4.f145808a));
                            break;
                        }
                        break;
                }
            }
        });
        this.f145816d = input2;
        View viewFindViewById4 = view.findViewById(R.id.edit_address_schedule_break_time);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input3 = (Input) viewFindViewById4;
        final int i15 = 3;
        input3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_address.adapter.schedule.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f145813c;

            {
                this.f145813c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        e eVar = this.f145813c.f145821i;
                        if (eVar != null) {
                            eVar.f145809b.K5(new InterfaceC42447e.C11594e(eVar.f145808a));
                            break;
                        }
                        break;
                    case 1:
                        e eVar2 = this.f145813c.f145821i;
                        if (eVar2 != null) {
                            eVar2.f145809b.K5(new InterfaceC42447e.f(eVar2.f145808a));
                            break;
                        }
                        break;
                    case 2:
                        e eVar3 = this.f145813c.f145821i;
                        if (eVar3 != null) {
                            eVar3.f145809b.K5(new InterfaceC42447e.g(eVar3.f145808a));
                            break;
                        }
                        break;
                    default:
                        e eVar4 = this.f145813c.f145821i;
                        if (eVar4 != null) {
                            eVar4.f145809b.K5(new InterfaceC42447e.b(eVar4.f145808a));
                            break;
                        }
                        break;
                }
            }
        });
        this.f145817e = input3;
        View viewFindViewById5 = view.findViewById(R.id.edit_address_schedule_work_days_error);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145818f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.edit_address_schedule_work_time_error);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145819g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.edit_address_schedule_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145820h = (TextView) viewFindViewById7;
    }

    @Override // com.avito.android.edit_address.adapter.schedule.i
    public final void BA(@Y61.k a aVar, @Y61.k e eVar) {
        this.f145821i = eVar;
        boolean z12 = aVar.f145798e;
        Button button = this.f145814b;
        if (z12) {
            D6.H(button);
        } else {
            D6.g(button);
        }
        String str = aVar.f145799f;
        Input input = this.f145815c;
        Input.t(input, str, false, 6);
        Input input2 = this.f145816d;
        String str2 = aVar.f145800g;
        Input.t(input2, str2, false, 6);
        String str3 = aVar.f145801h;
        Input input3 = this.f145817e;
        Input.t(input3, str3, false, 6);
        input3.setEnabled(!(str2 == null || str2.length() == 0));
        TextView textView = this.f145818f;
        boolean z13 = aVar.f145802i;
        D6.G(textView, z13);
        Input.f179303W.getClass();
        input.setState(z13 ? Input.f179305b0 : Input.f179304a0);
        TextView textView2 = this.f145819g;
        boolean z14 = aVar.f145803j;
        D6.G(textView2, z14);
        Input.f179303W.getClass();
        input2.setState(z14 ? Input.f179305b0 : Input.f179304a0);
        D6.G(this.f145820h, aVar.f145797d);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f145821i = null;
    }
}
