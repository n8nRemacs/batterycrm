package com.avito.android.profile;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.InterfaceC23487e;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.profile.SelectAvatarActionDialog;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: SelectAvatarActionDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/SelectAvatarActionDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "Listener", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectAvatarActionDialog extends BottomSheetDialogFragment implements InterfaceC28477j.a {

    /* compiled from: SelectAvatarActionDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/SelectAvatarActionDialog$Listener;", "", "Action", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SelectAvatarActionDialog.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/SelectAvatarActionDialog$Listener$Action;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Action {

            /* renamed from: b, reason: collision with root package name */
            public static final Action f221882b;

            /* renamed from: c, reason: collision with root package name */
            public static final Action f221883c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ Action[] f221884d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f221885e;

            static {
                Action action = new Action("TAKE", 0);
                f221882b = action;
                Action action2 = new Action("DELETE", 1);
                f221883c = action2;
                Action[] actionArr = {action, action2};
                f221884d = actionArr;
                f221885e = c.a(actionArr);
            }

            public Action() {
                throw null;
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) f221884d.clone();
            }
        }

        void o2(@k Action action);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.avatar_picker_dialog, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        D6.w(view.findViewById(R.id.empty_space));
        View viewFindViewById = view.findViewById(R.id.take_photo_button);
        final int i12 = 0;
        view.findViewById(R.id.delete_avatar_button).setOnClickListener(new View.OnClickListener(this) { // from class: l90.s

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SelectAvatarActionDialog f413567c;

            {
                this.f413567c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        SelectAvatarActionDialog selectAvatarActionDialog = this.f413567c;
                        InterfaceC23487e parentFragment = selectAvatarActionDialog.getParentFragment();
                        SelectAvatarActionDialog.Listener listener = parentFragment instanceof SelectAvatarActionDialog.Listener ? (SelectAvatarActionDialog.Listener) parentFragment : null;
                        if (listener != null) {
                            listener.o2(SelectAvatarActionDialog.Listener.Action.f221883c);
                        }
                        selectAvatarActionDialog.dismiss();
                        break;
                    default:
                        SelectAvatarActionDialog selectAvatarActionDialog2 = this.f413567c;
                        InterfaceC23487e parentFragment2 = selectAvatarActionDialog2.getParentFragment();
                        SelectAvatarActionDialog.Listener listener2 = parentFragment2 instanceof SelectAvatarActionDialog.Listener ? (SelectAvatarActionDialog.Listener) parentFragment2 : null;
                        if (listener2 != null) {
                            listener2.o2(SelectAvatarActionDialog.Listener.Action.f221882b);
                        }
                        selectAvatarActionDialog2.dismiss();
                        break;
                }
            }
        });
        final int i13 = 1;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: l90.s

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ SelectAvatarActionDialog f413567c;

            {
                this.f413567c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        SelectAvatarActionDialog selectAvatarActionDialog = this.f413567c;
                        InterfaceC23487e parentFragment = selectAvatarActionDialog.getParentFragment();
                        SelectAvatarActionDialog.Listener listener = parentFragment instanceof SelectAvatarActionDialog.Listener ? (SelectAvatarActionDialog.Listener) parentFragment : null;
                        if (listener != null) {
                            listener.o2(SelectAvatarActionDialog.Listener.Action.f221883c);
                        }
                        selectAvatarActionDialog.dismiss();
                        break;
                    default:
                        SelectAvatarActionDialog selectAvatarActionDialog2 = this.f413567c;
                        InterfaceC23487e parentFragment2 = selectAvatarActionDialog2.getParentFragment();
                        SelectAvatarActionDialog.Listener listener2 = parentFragment2 instanceof SelectAvatarActionDialog.Listener ? (SelectAvatarActionDialog.Listener) parentFragment2 : null;
                        if (listener2 != null) {
                            listener2.o2(SelectAvatarActionDialog.Listener.Action.f221882b);
                        }
                        selectAvatarActionDialog2.dismiss();
                        break;
                }
            }
        });
    }
}
