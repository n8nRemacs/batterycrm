package com.avito.android.actions_sheet.dialog;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22026a;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.actions_sheet.ActionsSheetContent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.lib.util.q;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsSheetLinkDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "Result", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActionsSheetLinkDialog extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: i0, reason: collision with root package name */
    @k
    public static final a f68198i0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f68199h0;

    /* compiled from: ActionsSheetLinkDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$Result;", "Landroid/os/Parcelable;", "ActionClicked", "Canceled", "Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$Result$ActionClicked;", "Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$Result$Canceled;", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends Parcelable {

        /* compiled from: ActionsSheetLinkDialog.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$Result$ActionClicked;", "Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$Result;", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActionClicked implements Result {

            @k
            public static final Parcelable.Creator<ActionClicked> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f68200b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f68201c;

            /* compiled from: ActionsSheetLinkDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActionClicked> {
                @Override // android.os.Parcelable.Creator
                public final ActionClicked createFromParcel(Parcel parcel) {
                    return new ActionClicked((DeepLink) parcel.readParcelable(ActionClicked.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionClicked[] newArray(int i12) {
                    return new ActionClicked[i12];
                }
            }

            public ActionClicked(@k DeepLink deepLink, @k String str) {
                this.f68200b = deepLink;
                this.f68201c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionClicked)) {
                    return false;
                }
                ActionClicked actionClicked = (ActionClicked) obj;
                return L.f(this.f68200b, actionClicked.f68200b) && L.f(this.f68201c, actionClicked.f68201c);
            }

            public final int hashCode() {
                return this.f68201c.hashCode() + (this.f68200b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ActionClicked(deepLink=");
                sb2.append(this.f68200b);
                sb2.append(", title=");
                return C22026a.c(sb2, this.f68201c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f68200b, i12);
                parcel.writeString(this.f68201c);
            }
        }

        /* compiled from: ActionsSheetLinkDialog.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$Result$Canceled;", "Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$Result;", "<init>", "()V", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Canceled implements Result {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Canceled f68202b = new Canceled();

            @k
            public static final Parcelable.Creator<Canceled> CREATOR = new a();

            /* compiled from: ActionsSheetLinkDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Canceled> {
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Canceled.f68202b;
                }

                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i12) {
                    return new Canceled[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: ActionsSheetLinkDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/actions_sheet/dialog/ActionsSheetLinkDialog$a;", "", "<init>", "()V", "_avito_actions-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ActionsSheetLinkDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            Resources resources;
            Context context = ActionsSheetLinkDialog.this.getContext();
            return Integer.valueOf((context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen.actions_sheet_horizontal_paddings));
        }
    }

    /* compiled from: ActionsSheetLinkDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ActionsSheetContent.Action f68205m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f68206n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f68207o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ActionsSheetContent.Action action, String str, com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(0);
            this.f68205m = action;
            this.f68206n = str;
            this.f68207o = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ActionsSheetContent.Action action = this.f68205m;
            Result.ActionClicked actionClicked = new Result.ActionClicked(action.getUri(), action.getTitle());
            String str = this.f68206n;
            ActionsSheetLinkDialog actionsSheetLinkDialog = ActionsSheetLinkDialog.this;
            a aVar = ActionsSheetLinkDialog.f68198i0;
            FragmentManager parentFragmentManager = actionsSheetLinkDialog.getParentFragmentManager();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("result.key", actionClicked);
            G0 g02 = G0.f406611a;
            parentFragmentManager.o0(bundle, str);
            this.f68207o.r();
            return G0.f406611a;
        }
    }

    /* compiled from: ActionsSheetLinkDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f68209m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.f68209m = str;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Result.Canceled canceled = Result.Canceled.f68202b;
            String str = this.f68209m;
            ActionsSheetLinkDialog actionsSheetLinkDialog = ActionsSheetLinkDialog.this;
            a aVar = ActionsSheetLinkDialog.f68198i0;
            FragmentManager parentFragmentManager = actionsSheetLinkDialog.getParentFragmentManager();
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("result.key", canceled);
            G0 g02 = G0.f406611a;
            parentFragmentManager.o0(bundle, str);
            return G0.f406611a;
        }
    }

    public ActionsSheetLinkDialog() {
        super(0, 1, null);
        this.f68199h0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        Integer numA;
        Drawable drawableH;
        Bundle bundleRequireArguments = requireArguments();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arg.actions_sheet.content", ActionsSheetContent.class) : bundleRequireArguments.getParcelable("arg.actions_sheet.content");
        if (parcelable == null) {
            throw new IllegalArgumentException("Actions sheet content is not provided");
        }
        ActionsSheetContent actionsSheetContent = (ActionsSheetContent) parcelable;
        String string = requireArguments().getString("arg.actions_sheet.request_key");
        if (string == null) {
            throw new IllegalArgumentException("Request key is not provided");
        }
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Dialog_Re23));
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextThemeWrapperB, 0, 2, null);
        String title = actionsSheetContent.getTitle();
        Boolean isClosable = actionsSheetContent.getIsClosable();
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, title, isClosable != null ? isClosable.booleanValue() : false, true, 2);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        View viewInflate = LayoutInflater.from(contextThemeWrapperB).inflate(R.layout.actions_sheet_dialog, (ViewGroup) null);
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        for (ActionsSheetContent.Action action : actionsSheetContent.getActions()) {
            c cVar = new c(action, string, dVar);
            ListItem listItem = new ListItem(viewGroup.getContext(), null);
            listItem.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            listItem.setAppearance(C35835l0.j(R.attr.listItemDefaultMedium, listItem.getContext()));
            InterfaceC42726C interfaceC42726C = this.f68199h0;
            listItem.setPadding(((Number) interfaceC42726C.getValue()).intValue(), 0, ((Number) interfaceC42726C.getValue()).intValue(), 0);
            listItem.setTitle(action.getTitle());
            listItem.setSubtitle(action.getSubtitle());
            String icon = action.getIcon();
            if (icon != null && (numA = q.a(icon)) != null && (drawableH = C35835l0.h(numA.intValue(), listItem.getContext())) != null) {
                ListItem.i(listItem, drawableH);
                listItem.setLeftIconColor(C35835l0.d(R.attr.black, listItem.getContext()));
            }
            listItem.setOnClickListener(new Ae0.b(27, cVar));
            viewGroup.addView(listItem);
        }
        dVar.setContentView(viewInflate);
        dVar.R(new d(string));
        return dVar;
    }
}
