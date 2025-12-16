package Au;

import A91.p;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.action_select_link.ActionSelectLink;
import com.avito.android.deep_linking.action_select_link.ActionSelectMenu;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionSelectBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAu/c;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Au.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogC13081c extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f671J = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f672E;

    /* renamed from: F, reason: collision with root package name */
    public final Button f673F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final List<ActionSelectMenu.Action> f674G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f675H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final C13079a f676I;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogC13081c(@k Context context, @k ActionSelectLink actionSelectLink, @k l<? super DeepLink, G0> lVar) {
        super(context, 0, 2, null);
        this.f672E = lVar;
        this.f676I = new C13079a(this, 0);
        ActionSelectMenu actionSelectMenu = actionSelectLink.f132881b;
        this.f675H = actionSelectMenu.getButton() != null;
        setContentView(R.layout.action_select_menu);
        S(C35835l0.g(context).y);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        I5.a((TextView) findViewById(R.id.title), actionSelectMenu.getTitle(), false);
        ActionSelectMenu.Button button = actionSelectMenu.getButton();
        Button button2 = (Button) findViewById(R.id.action_button);
        this.f673F = button2;
        if (button != null) {
            D6.H(button2);
            button2.setText(button.getTitle());
            button2.setEnabled(false);
            button2.setOnClickListener(new p(this, 1));
        } else {
            D6.w(button2);
        }
        List<ActionSelectMenu.Action> actions = actionSelectMenu.getActions();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.actions_container);
        for (ActionSelectMenu.Action action : actions) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            ListItemCheckmark listItemCheckmark = new ListItemCheckmark(getContext(), null);
            listItemCheckmark.setLayoutParams(layoutParams);
            listItemCheckmark.setClickable(true);
            listItemCheckmark.setTitle(action.getTitle());
            linearLayout.addView(listItemCheckmark);
            if (this.f675H) {
                listItemCheckmark.e(this.f676I);
            } else {
                listItemCheckmark.setOnClickListener(new ViewOnClickListenerC13080b(0, this, action));
            }
        }
        this.f674G = actions;
    }
}
