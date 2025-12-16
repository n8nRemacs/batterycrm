package ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet;

import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.C22026a;
import androidx.core.content.res.i;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.h;
import com.google.android.material.textfield.TextInputLayout;
import j.InterfaceC42153i;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.R;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.BaseActivity;
import ru.cyberity.cbr.core.presentation.base.adapter.decorator.DividersItemDecoration;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.theme.CBRTypographyElement;
import ru.cyberity.cbr.core.widget.CBRBottomSheetView;
import ru.cyberity.cbr.core.widget.CBRToolbarView;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog;

/* compiled from: CBRPickerDialog.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 A2\u00020\u0001:\u0006ABCDEFB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00060\u000eR\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b$\u0010%J+\u0010*\u001a\u00020\u00062\n\u0010&\u001a\u00060\u000eR\u00020\u00002\u0006\u0010'\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b*\u0010+J\u001d\u00101\u001a\u00020.*\u00020(2\b\u0010-\u001a\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b/\u00100R$\u00103\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u00109\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00104R\u0014\u0010<\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010@\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u000b¨\u0006G"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Lcom/google/android/material/bottomsheet/h;", "bottomSheetDialog", "Lkotlin/G0;", "setupFullHeight", "(Lcom/google/android/material/bottomsheet/h;)V", "", "getWindowHeight", "()I", "Landroid/view/ViewGroup;", "parentView", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;", "createItemViewHolder", "(Landroid/view/ViewGroup;)Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "onDismiss", "Landroid/view/View;", "view", "getThemeBackgroundColor", "(Landroid/view/View;)Ljava/lang/Integer;", "Landroid/view/LayoutInflater;", "inflater", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "holder", "position", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "item", "bindItemViewHolder", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;ILru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;)V", "", "query", "", "isEligibleForQuery$cyberity_mobile_sdk_ui_release", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;Ljava/lang/CharSequence;)Z", "isEligibleForQuery", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerCallBack;", "pickerCallBack", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerCallBack;", "getPickerCallBack", "()Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerCallBack;", "setPickerCallBack", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerCallBack;)V", "internalPickerCallback", "getSortAlphabetically", "()Z", "sortAlphabetically", "getShowSearch", "showSearch", "getItemLayoutId", "itemLayoutId", "Companion", "DiffCallBack", "Item", "ItemAdapter", "PickerCallBack", "PickerItemViewHolder", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public class CBRPickerDialog extends BottomSheetDialogFragment {

    @k
    private final PickerCallBack internalPickerCallback = new PickerCallBack() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog$internalPickerCallback$1
        @Override // ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog.PickerCallBack
        public void onItemSelected(@k CBRPickerDialog.Item item) {
            Bundle arguments = this.this$0.getArguments();
            String string = arguments != null ? arguments.getString("extra_request_key") : null;
            Bundle arguments2 = this.this$0.getArguments();
            String string2 = arguments2 != null ? arguments2.getString("EXTRA_RESULT_KEY") : null;
            if (string == null || string2 == null) {
                CBRPickerDialog.PickerCallBack pickerCallBack = this.this$0.getPickerCallBack();
                if (pickerCallBack != null) {
                    pickerCallBack.onItemSelected(item);
                }
            } else {
                CBRPickerDialog cBRPickerDialog = this.this$0;
                Bundle bundle = new Bundle();
                bundle.putParcelable(string2, item);
                G0 g02 = G0.f406611a;
                C22960s.a(bundle, cBRPickerDialog, string);
            }
            CBRPickerDialog.PickerCallBack pickerCallBack2 = this.this$0.getPickerCallBack();
            if (pickerCallBack2 != null) {
                pickerCallBack2.onDialogClose();
            }
            this.this$0.dismiss();
        }
    };

    @l
    private PickerCallBack pickerCallBack;

    /* compiled from: CBRPickerDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$DiffCallBack;", "Landroidx/recyclerview/widget/o$b;", "", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class DiffCallBack extends C23424o.b {

        @k
        private final List<Item> newList;

        @k
        private final List<Item> oldList;

        public DiffCallBack(@k List<Item> list, @k List<Item> list2) {
            this.oldList = list;
            this.newList = list2;
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return L.f(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return L.f(this.oldList.get(oldItemPosition), this.newList.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public int getNewListSize() {
            return this.newList.size();
        }

        @Override // androidx.recyclerview.widget.C23424o.b
        public int getOldListSize() {
            return this.oldList.size();
        }
    }

    /* compiled from: CBRPickerDialog.kt */
    @K51.d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "Landroid/os/Parcelable;", "", "id", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        @k
        private final String id;

        @k
        private final String title;

        /* compiled from: CBRPickerDialog.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                return new Item(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@k String str, @k String str2) {
            this.id = str;
            this.title = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return L.f(this.id, item.id) && L.f(this.title, item.title);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Item(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            return C22026a.c(sb2, this.title, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: CBRPickerDialog.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u00012\u00020\u0004BF\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012%\u0010\u000f\u001a!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\b\u0012\u00060\u0002R\u00020\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R3\u0010\u000f\u001a!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\b\u0012\u00060\u0002R\u00020\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog;", "Landroid/widget/Filterable;", "", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "items", "Ljava/text/Collator;", "collator", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lkotlin/S;", "name", "parentView", "itemViewHolderFactory", "<init>", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog;[Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;Ljava/text/Collator;LY41/l;)V", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;", "holder", "position", "Lkotlin/G0;", "onBindViewHolder", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;I)V", "getItemCount", "()I", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "[Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "Ljava/text/Collator;", "LY41/l;", "Ljava/util/Comparator;", "itemComparator", "Ljava/util/Comparator;", "", "filteredItems", "Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class ItemAdapter extends RecyclerView.Adapter<PickerItemViewHolder> implements Filterable {

        @k
        private final Collator collator;

        @k
        private final List<Item> filteredItems;

        @k
        private final Comparator<Item> itemComparator;

        @k
        private final Y41.l<ViewGroup, PickerItemViewHolder> itemViewHolderFactory;

        @l
        private final Item[] items;

        /* JADX WARN: Multi-variable type inference failed */
        public ItemAdapter(@l Item[] itemArr, @k Collator collator, @k Y41.l<? super ViewGroup, PickerItemViewHolder> lVar) {
            this.items = itemArr;
            this.collator = collator;
            this.itemViewHolderFactory = lVar;
            Comparator<Item> comparator = new Comparator() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return CBRPickerDialog.ItemAdapter.m317itemComparator$lambda0(this.f434238b, (CBRPickerDialog.Item) obj, (CBRPickerDialog.Item) obj2);
                }
            };
            this.itemComparator = comparator;
            ArrayList arrayList = new ArrayList();
            if (itemArr != null) {
                C42745f0.i(arrayList, itemArr);
            }
            if (CBRPickerDialog.this.getSortAlphabetically()) {
                Collections.sort(arrayList, comparator);
            }
            this.filteredItems = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: itemComparator$lambda-0, reason: not valid java name */
        public static final int m317itemComparator$lambda0(ItemAdapter itemAdapter, Item item, Item item2) {
            return itemAdapter.collator.compare(item.getTitle(), item2.getTitle());
        }

        @Override // android.widget.Filterable
        @k
        public Filter getFilter() {
            final CBRPickerDialog cBRPickerDialog = CBRPickerDialog.this;
            return new Filter() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog$ItemAdapter$getFilter$1
                @Override // android.widget.Filter
                @k
                public Filter.FilterResults performFiltering(@l CharSequence constraint) {
                    ArrayList arrayList;
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    CBRPickerDialog.ItemAdapter itemAdapter = this.this$0;
                    CBRPickerDialog cBRPickerDialog2 = cBRPickerDialog;
                    CBRPickerDialog.Item[] itemArr = itemAdapter.items;
                    if (itemArr != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (CBRPickerDialog.Item item : itemArr) {
                            if (cBRPickerDialog2.isEligibleForQuery$cyberity_mobile_sdk_ui_release(item, constraint != null ? C43066x.A0(constraint) : null)) {
                                arrayList2.add(item);
                            }
                        }
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (cBRPickerDialog2.getSortAlphabetically()) {
                        Collections.sort(arrayList, itemAdapter.itemComparator);
                    }
                    filterResults.values = arrayList;
                    filterResults.count = arrayList.size();
                    return filterResults;
                }

                @Override // android.widget.Filter
                public void publishResults(@l CharSequence constraint, @l Filter.FilterResults results) {
                    Object obj = results != null ? results.values : null;
                    List list = obj instanceof List ? (List) obj : null;
                    if (list != null) {
                        CBRPickerDialog.ItemAdapter itemAdapter = this.this$0;
                        C23424o.e eVarA = C23424o.a(new CBRPickerDialog.DiffCallBack(itemAdapter.filteredItems, list), true);
                        itemAdapter.filteredItems.clear();
                        itemAdapter.filteredItems.addAll(list);
                        eVarA.b(itemAdapter);
                    }
                }
            };
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.filteredItems.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@k PickerItemViewHolder holder, int position) {
            holder.bind(position, this.filteredItems.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @k
        public PickerItemViewHolder onCreateViewHolder(@k ViewGroup parent, int viewType) {
            return this.itemViewHolderFactory.invoke(parent);
        }
    }

    /* compiled from: CBRPickerDialog.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "<init>", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog;Landroid/view/View;)V", "", "position", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "item", "Lkotlin/G0;", "bind", "(ILru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class PickerItemViewHolder extends RecyclerView.C {
        public PickerItemViewHolder(@k View view) {
            super(view);
        }

        public final void bind(int position, @k Item item) {
            CBRPickerDialog.this.bindItemViewHolder(this, position, item);
        }
    }

    /* compiled from: CBRPickerDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog$onViewCreated$2", f = "CBRPickerDialog.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog$onViewCreated$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ TextInputLayout $searchEditLayout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextInputLayout textInputLayout, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$searchEditLayout = textInputLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return CBRPickerDialog.this.new AnonymousClass2(this.$searchEditLayout, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            ru.cyberity.cbr.core.b serviceLocator;
            ru.cyberity.cbr.core.data.source.dynamic.c cVarM;
            c.C12476c c12476c;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                ActivityC22955m activityC22955mRequireActivity = CBRPickerDialog.this.requireActivity();
                BaseActivity baseActivity = activityC22955mRequireActivity instanceof BaseActivity ? (BaseActivity) activityC22955mRequireActivity : null;
                if (baseActivity != null && (serviceLocator = baseActivity.getServiceLocator()) != null && (cVarM = serviceLocator.m()) != null) {
                    this.label = 1;
                    obj = cVarM.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ru.cyberity.cbr.core.data.source.dynamic.a aVar = (ru.cyberity.cbr.core.data.source.dynamic.a) obj;
            if (aVar != null && (c12476c = (c.C12476c) aVar.d()) != null) {
                TextInputLayout textInputLayout = this.$searchEditLayout;
                EditText editText = textInputLayout != null ? textInputLayout.getEditText() : null;
                if (editText != null) {
                    editText.setHint(c12476c.a("sns_general_search_placeholder"));
                }
            }
            return G0.f406611a;
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((AnonymousClass2) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindItemViewHolder$lambda-10, reason: not valid java name */
    public static final void m314bindItemViewHolder$lambda10(CBRPickerDialog cBRPickerDialog, Item item, View view) {
        cBRPickerDialog.internalPickerCallback.onItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PickerItemViewHolder createItemViewHolder(ViewGroup parentView) {
        Integer color;
        View viewInflate = LayoutInflater.from(parentView.getContext()).inflate(getItemLayoutId(), parentView, false);
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (color = themeHelper.getColor(customTheme, CBRColorElement.LIST_SELECTED_ITEM_BACKGROUND, themeHelper.isDarkTheme(viewInflate))) != null) {
            int iIntValue = color.intValue();
            Drawable background = viewInflate.getBackground();
            RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(ColorStateList.valueOf(iIntValue));
            }
        }
        return new PickerItemViewHolder(viewInflate);
    }

    private final int getItemLayoutId() {
        return requireArguments().getInt("extra_item_layout_id");
    }

    private final boolean getShowSearch() {
        return requireArguments().getBoolean("extra_show_search", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSortAlphabetically() {
        return requireArguments().getBoolean("extra_sort", true);
    }

    private final int getWindowHeight() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateDialog$lambda-0, reason: not valid java name */
    public static final void m315onCreateDialog$lambda0(CBRPickerDialog cBRPickerDialog, DialogInterface dialogInterface) {
        h hVar = (h) dialogInterface;
        if (cBRPickerDialog.getShowSearch()) {
            cBRPickerDialog.setupFullHeight(hVar);
        } else {
            BottomSheetBehavior.B((FrameLayout) hVar.findViewById(R.id.design_bottom_sheet)).K(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4, reason: not valid java name */
    public static final void m316onViewCreated$lambda4(CBRPickerDialog cBRPickerDialog, View view) {
        PickerCallBack pickerCallBack = cBRPickerDialog.pickerCallBack;
        if (pickerCallBack != null) {
            pickerCallBack.onDialogClose();
        }
        cBRPickerDialog.dismiss();
    }

    private final void setupFullHeight(h bottomSheetDialog) {
        Float metricDimension;
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        int windowHeight = getWindowHeight();
        if (layoutParams != null) {
            layoutParams.height = windowHeight;
        }
        frameLayout.setLayoutParams(layoutParams);
        Integer themeBackgroundColor = getThemeBackgroundColor(frameLayout);
        if (themeBackgroundColor != null) {
            int iIntValue = themeBackgroundColor.intValue();
            Drawable background = frameLayout.getBackground();
            com.google.android.material.shape.k kVar = background instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) background : null;
            if (kVar != null) {
                ThemeHelper themeHelper = ThemeHelper.INSTANCE;
                ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
                if (customTheme != null && (metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.BOTTOM_SHEET_CORNER_RADIUS)) != null) {
                    kVar.l(metricDimension.floatValue());
                }
                kVar.n(ColorStateList.valueOf(iIntValue));
                View viewFindViewById = frameLayout.findViewById(R.id.cbr_bottom_sheet);
                CBRBottomSheetView cBRBottomSheetView = viewFindViewById instanceof CBRBottomSheetView ? (CBRBottomSheetView) viewFindViewById : null;
                if (cBRBottomSheetView != null) {
                    cBRBottomSheetView.setBackground(null);
                }
            } else {
                frameLayout.setBackgroundColor(0);
            }
        }
        bottomSheetBehaviorB.b(3);
    }

    @InterfaceC42153i
    public void bindItemViewHolder(@k PickerItemViewHolder holder, int position, @k Item item) {
        View view = holder.itemView;
        ((TextView) view.findViewById(android.R.id.text1)).setText(item.getTitle());
        view.setOnClickListener(new c(0, this, item));
    }

    @l
    public final PickerCallBack getPickerCallBack() {
        return this.pickerCallBack;
    }

    @l
    public Integer getThemeBackgroundColor(@k View view) {
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            return themeHelper.getColor(customTheme, CBRColorElement.BOTTOM_SHEET_BACKGROUND, themeHelper.isDarkTheme(view));
        }
        return null;
    }

    public final boolean isEligibleForQuery$cyberity_mobile_sdk_ui_release(@k Item item, @l CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return C43066x.q(item.getTitle(), charSequence, true);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@k DialogInterface dialog) {
        super.onCancel(dialog);
        PickerCallBack pickerCallBack = this.pickerCallBack;
        if (pickerCallBack != null) {
            pickerCallBack.onCancel();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @k
    public Dialog onCreateDialog(@l Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CBRPickerDialog.m315onCreateDialog$lambda0(this.f434234a, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup container, @l Bundle savedInstanceState) {
        return inflater.inflate(getShowSearch() ? R.layout.cbr_picker_dialog : R.layout.cbr_picker_dialog_no_search, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@k DialogInterface dialog) {
        PickerCallBack pickerCallBack = this.pickerCallBack;
        if (pickerCallBack != null) {
            pickerCallBack.onDismiss();
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) throws Resources.NotFoundException {
        Item[] itemArr;
        EditText editText;
        EditText editText2;
        EditText editText3;
        Parcelable[] parcelableArray;
        super.onViewCreated(view, savedInstanceState);
        CBRToolbarView cBRToolbarView = (CBRToolbarView) view.findViewById(R.id.cbr_toolbar);
        if (cBRToolbarView != null) {
            Drawable drawableOnResolveIcon = n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.CLOSE.getImageName());
            if (drawableOnResolveIcon == null) {
                Resources resources = requireContext().getResources();
                int i12 = R.drawable.cbr_ic_close;
                Resources.Theme theme = requireContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = i.f44673a;
                drawableOnResolveIcon = resources.getDrawable(i12, theme);
            }
            cBRToolbarView.setCloseButtonDrawable(drawableOnResolveIcon);
        }
        if (cBRToolbarView != null) {
            cBRToolbarView.setOnCloseButtonClickListener(new View.OnClickListener() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CBRPickerDialog.m316onViewCreated$lambda4(this.f434233b, view2);
                }
            });
        }
        final TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.cbr_editor_layout);
        C22981N.a(getLifecycle()).c(new AnonymousClass2(textInputLayout, null));
        if (textInputLayout != null) {
            Drawable drawableOnResolveIcon2 = n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.SEARCH.getImageName());
            if (drawableOnResolveIcon2 == null) {
                Resources resources2 = requireContext().getResources();
                int i13 = R.drawable.cbr_ic_search;
                Resources.Theme theme2 = requireContext().getTheme();
                ThreadLocal<TypedValue> threadLocal2 = i.f44673a;
                drawableOnResolveIcon2 = resources2.getDrawable(i13, theme2);
            }
            textInputLayout.setStartIconDrawable(drawableOnResolveIcon2);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (parcelableArray = arguments.getParcelableArray("extra_items")) == null) {
            itemArr = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof Item) {
                    arrayList.add(parcelable);
                }
            }
            itemArr = (Item[]) arrayList.toArray(new Item[0]);
        }
        final ItemAdapter itemAdapter = new ItemAdapter(itemArr, Collator.getInstance(n0.f432787a.getLocale()), new CBRPickerDialog$onViewCreated$adapter$1(this));
        if (textInputLayout != null && (editText3 = textInputLayout.getEditText()) != null) {
            editText3.addTextChangedListener(new TextWatcher() { // from class: ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog$onViewCreated$$inlined$doOnTextChanged$1
                @Override // android.text.TextWatcher
                public void onTextChanged(@l CharSequence text, int start, int before, int count) {
                    Filter filter = itemAdapter.getFilter();
                    EditText editText4 = textInputLayout.getEditText();
                    filter.filter(editText4 != null ? editText4.getText() : null);
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(@l Editable s5) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@l CharSequence text, int start, int count, int after) {
                }
            });
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cbr_list);
        if (recyclerView != null) {
            recyclerView.getLayoutManager();
        }
        if (recyclerView != null) {
            requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(itemAdapter);
        }
        if (!getShowSearch()) {
            ViewGroup.LayoutParams layoutParams = recyclerView != null ? recyclerView.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null) {
            Integer color = themeHelper.getColor(customTheme, CBRColorElement.LIST_SEPARATOR, recyclerView != null ? themeHelper.isDarkTheme(recyclerView) : false);
            Float metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.LIST_SEPARATOR_HEIGHT);
            if (color != null && recyclerView != null) {
                Float metricDimension2 = themeHelper.getMetricDimension(customTheme, CBRMetricElement.LIST_SEPARATOR_MARGIN_LEFT);
                float fFloatValue = metricDimension2 != null ? metricDimension2.floatValue() : 0.0f;
                Float metricDimension3 = themeHelper.getMetricDimension(customTheme, CBRMetricElement.LIST_SEPARATOR_MARGIN_RIGHT);
                recyclerView.l(new DividersItemDecoration(fFloatValue, metricDimension3 != null ? metricDimension3.floatValue() : 0.0f, metricDimension != null ? metricDimension.floatValue() : s.a(1), color.intValue()), -1);
            }
            Integer color2 = themeHelper.getColor(customTheme, CBRColorElement.FIELD_PLACEHOLDER, recyclerView != null ? themeHelper.isDarkTheme(recyclerView) : false);
            if (color2 != null) {
                int iIntValue = color2.intValue();
                if (textInputLayout != null && (editText2 = textInputLayout.getEditText()) != null) {
                    editText2.setHintTextColor(iIntValue);
                }
            }
            if (textInputLayout == null || (editText = textInputLayout.getEditText()) == null) {
                return;
            }
            themeHelper.applyTheme(editText, CBRTypographyElement.SUBTITLE2, CBRColorElement.FIELD_CONTENT);
        }
    }

    public final void setPickerCallBack(@l PickerCallBack pickerCallBack) {
        this.pickerCallBack = pickerCallBack;
    }

    /* compiled from: CBRPickerDialog.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$PickerCallBack;", "", "Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;", "item", "Lkotlin/G0;", "onItemSelected", "(Lru/cyberity/cbr/core/widget/autocompletePhone/bottomsheet/CBRPickerDialog$Item;)V", "onDismiss", "()V", "onDialogClose", "onCancel", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface PickerCallBack {
        void onItemSelected(@k Item item);

        default void onCancel() {
        }

        default void onDialogClose() {
        }

        default void onDismiss() {
        }
    }
}
