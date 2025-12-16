package com.avito.android.publish.iac_for_pro;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: IacForProConfirmDisablingBottomSheet.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/iac_for_pro/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f236058F = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Y41.a<G0> f236059E;

    /* compiled from: IacForProConfirmDisablingBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            final b bVar = (b) this.receiver;
            int i12 = b.f236058F;
            bVar.getClass();
            ImageView imageView = (ImageView) view2.findViewById(R.id.iac_for_pro_info_close_confirm_close);
            if (imageView != null) {
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.iac_for_pro.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        b bVar2 = bVar;
                        switch (i13) {
                            case 0:
                                int i14 = b.f236058F;
                                bVar2.r();
                                break;
                            case 1:
                                int i15 = b.f236058F;
                                bVar2.r();
                                break;
                            default:
                                bVar2.f236059E.invoke();
                                bVar2.r();
                                break;
                        }
                    }
                });
            }
            Button button = (Button) view2.findViewById(R.id.iac_for_pro_confirm_disable_cancel_btn);
            if (button != null) {
                final int i14 = 1;
                button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.iac_for_pro.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        b bVar2 = bVar;
                        switch (i14) {
                            case 0:
                                int i142 = b.f236058F;
                                bVar2.r();
                                break;
                            case 1:
                                int i15 = b.f236058F;
                                bVar2.r();
                                break;
                            default:
                                bVar2.f236059E.invoke();
                                bVar2.r();
                                break;
                        }
                    }
                });
            }
            Button button2 = (Button) view2.findViewById(R.id.iac_for_pro_confirm_disable_confirm_btn);
            if (button2 != null) {
                final int i15 = 2;
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.publish.iac_for_pro.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        b bVar2 = bVar;
                        switch (i15) {
                            case 0:
                                int i142 = b.f236058F;
                                bVar2.r();
                                break;
                            case 1:
                                int i152 = b.f236058F;
                                bVar2.r();
                                break;
                            default:
                                bVar2.f236059E.invoke();
                                bVar2.r();
                                break;
                        }
                    }
                });
            }
            return G0.f406611a;
        }
    }

    public b(@k Context context, @k Y41.a<G0> aVar) {
        super(context, 0, 2, null);
        this.f236059E = aVar;
        C(R.layout.iac_for_pro_confirm_disable_sheet, new a(1, this, b.class, "createView", "createView(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
    }
}
