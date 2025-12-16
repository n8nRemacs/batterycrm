package com.avito.android.select.collapsable_chips;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.select.collapsable_chips.CollapsableChips;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CollapsableChips.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class c extends N implements Y41.a<View> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f265367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CollapsableChips f265368m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, CollapsableChips collapsableChips) {
        super(0);
        this.f265367l = context;
        this.f265368m = collapsableChips;
    }

    @Override // Y41.a
    public final View invoke() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f265367l);
        final CollapsableChips collapsableChips = this.f265368m;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.category_group_link, (ViewGroup) collapsableChips, false);
        View viewFindViewById = viewInflate.findViewById(R.id.category_action_button_link);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        D6.G((ImageView) viewFindViewById2, true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.select.collapsable_chips.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollapsableChips collapsableChips2 = collapsableChips;
                collapsableChips2.com.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String = collapsableChips2.com.avito.android.remote.model.messenger.voice.VoiceInfo.STATE java.lang.String == 1 ? 2 : 1;
                CollapsableChips.b<?> bVar = collapsableChips2.f265350s;
                if (bVar != null) {
                    collapsableChips2.t(bVar);
                }
            }
        });
        return viewInflate;
    }
}
