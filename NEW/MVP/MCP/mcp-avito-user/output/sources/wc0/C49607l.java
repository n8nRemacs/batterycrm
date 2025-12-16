package wc0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.profile_settings_extended.entity.SettingsActionButton;
import com.avito.android.util.C35835l0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SettingActionsBottomMenu.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwc0/l;", "Lwc0/k;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wc0.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49607l implements InterfaceC49606k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f441714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f441716c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f441717d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public LinearLayout f441718e;

    /* compiled from: SettingActionsBottomMenu.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wc0.l$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SettingsActionButton.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SettingsActionButton.Type type = SettingsActionButton.Type.f230300b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49607l(@Y61.k Context context, int i12, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        this.f441714a = context;
        this.f441715b = i12;
        this.f441716c = lVar;
    }

    public final void a(List<SettingsActionButton> list) {
        int i12;
        LinearLayout linearLayout = this.f441718e;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            for (SettingsActionButton settingsActionButton : list) {
                Drawable drawable = null;
                ListItem listItem = new ListItem(this.f441714a, null);
                listItem.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItem.setTitle(settingsActionButton.f230297b);
                int i13 = this.f441715b;
                listItem.setPadding(i13, 0, i13, 0);
                Context context = listItem.getContext();
                int iOrdinal = settingsActionButton.f230298c.ordinal();
                if (iOrdinal == 0) {
                    i12 = R.attr.ic_edit20;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.ic_return20;
                }
                Drawable drawableH = C35835l0.h(i12, context);
                if (drawableH != null) {
                    drawableH.setTintList(C35835l0.e(R.attr.black, listItem.getContext()));
                    drawable = drawableH;
                }
                ListItem.i(listItem, drawable);
                DeepLink deepLink = settingsActionButton.f230299d;
                if (deepLink != null) {
                    listItem.setOnClickListener(new ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c(7, this, deepLink));
                }
                linearLayout.addView(listItem);
            }
        }
    }
}
