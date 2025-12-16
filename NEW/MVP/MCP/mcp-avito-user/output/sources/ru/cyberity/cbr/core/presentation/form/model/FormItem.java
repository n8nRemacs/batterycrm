package ru.cyberity.cbr.core.presentation.form.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.remote.c;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;

/* compiled from: FormItem.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 (2\u00020\u0001:\u0013)(*+,-./0123456789:Be\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\n\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012R\u0011\u0010'\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001e\u0082\u0001\u0011;<=>?@ABCDEFGHIJK¨\u0006L"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Landroid/os/Parcelable;", "", "sectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "value", "", "values", "", "isEnabled", "", "error", "condition", "isMultivalued", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/util/List;ZLjava/lang/CharSequence;Ljava/lang/String;Z)V", "toShortString", "()Ljava/lang/String;", "toString", "Ljava/lang/String;", "getSectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getValue", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "Z", "()Z", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "getCondition", "setCondition", "(Ljava/lang/String;)V", "getFormItemId", "formItemId", "isRequired", "Companion", "Bool", "CountrySelect", "Date", "DateTime", "Description", "FileAttachment", "Hidden", "ItemState", "MultiFileAttachments", "MultiSelect", "Phone", "Section", "Select", "SelectDropdown", "Subtitle", "Text", "TextArea", "Title", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Bool;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$CountrySelect;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Date;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$DateTime;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Description;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$FileAttachment;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Hidden;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiSelect;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Section;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Select;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$SelectDropdown;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Subtitle;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Text;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$TextArea;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$Title;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class FormItem implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @l
    private String condition;

    @l
    private final CharSequence error;
    private final boolean isEnabled;
    private final boolean isMultivalued;

    @k
    private final h item;

    @l
    private final String sectionId;

    @l
    private final String value;

    @l
    private final List<String> values;

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Bool;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "value", "", "error", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$Bool;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "getValue", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Bool extends FormItem {

        @k
        public static final Parcelable.Creator<Bool> CREATOR = new Creator();

        @l
        private final CharSequence error;

        @k
        private final h item;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Bool> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Bool createFromParcel(@k Parcel parcel) {
                return new Bool((h) parcel.readParcelable(Bool.class.getClassLoader()), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Bool[] newArray(int i12) {
                return new Bool[i12];
            }
        }

        public /* synthetic */ Bool(h hVar, String str, String str2, CharSequence charSequence, int i12, C42822w c42822w) {
            this(hVar, str, str2, (i12 & 8) != 0 ? null : charSequence);
        }

        public static /* synthetic */ Bool copy$default(Bool bool, h hVar, String str, String str2, CharSequence charSequence, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = bool.getItem();
            }
            if ((i12 & 2) != 0) {
                str = bool.getSectionId();
            }
            if ((i12 & 4) != 0) {
                str2 = bool.getValue();
            }
            if ((i12 & 8) != 0) {
                charSequence = bool.getError();
            }
            return bool.copy(hVar, str, str2, charSequence);
        }

        @k
        public final Bool copy(@k h item, @k String sectionId, @l String value, @l CharSequence error) {
            return new Bool(item, sectionId, value, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bool)) {
                return false;
            }
            Bool bool = (Bool) other;
            return L.f(getItem(), bool.getItem()) && L.f(getSectionId(), bool.getSectionId()) && L.f(getValue(), bool.getValue()) && L.f(getError(), bool.getError());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Bool(item=" + getItem() + ", sectionId=" + getSectionId() + ", value=" + getValue() + ", error=" + ((Object) getError()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeString(this.value);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public Bool(@k h hVar, @k String str, @l String str2, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.value = str2;
            this.error = charSequence;
        }
    }

    /* compiled from: FormItem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Companion;", "", "()V", "TYPE_SECTION", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b'\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Date;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "", "onlyPastDates", "value", "", "error", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$Date;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "Z", "getOnlyPastDates", "()Z", "getValue", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Date extends FormItem {

        @k
        public static final Parcelable.Creator<Date> CREATOR = new Creator();

        @l
        private final CharSequence error;

        @k
        private final h item;
        private final boolean onlyPastDates;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Date> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Date createFromParcel(@k Parcel parcel) {
                return new Date((h) parcel.readParcelable(Date.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Date[] newArray(int i12) {
                return new Date[i12];
            }
        }

        public /* synthetic */ Date(h hVar, String str, boolean z12, String str2, CharSequence charSequence, int i12, C42822w c42822w) {
            this(hVar, str, (i12 & 4) != 0 ? false : z12, str2, (i12 & 16) != 0 ? null : charSequence);
        }

        public static /* synthetic */ Date copy$default(Date date, h hVar, String str, boolean z12, String str2, CharSequence charSequence, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = date.getItem();
            }
            if ((i12 & 2) != 0) {
                str = date.getSectionId();
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                z12 = date.onlyPastDates;
            }
            boolean z13 = z12;
            if ((i12 & 8) != 0) {
                str2 = date.getValue();
            }
            String str4 = str2;
            if ((i12 & 16) != 0) {
                charSequence = date.getError();
            }
            return date.copy(hVar, str3, z13, str4, charSequence);
        }

        @k
        public final Date copy(@k h item, @k String sectionId, boolean onlyPastDates, @l String value, @l CharSequence error) {
            return new Date(item, sectionId, onlyPastDates, value, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Date)) {
                return false;
            }
            Date date = (Date) other;
            return L.f(getItem(), date.getItem()) && L.f(getSectionId(), date.getSectionId()) && this.onlyPastDates == date.onlyPastDates && L.f(getValue(), date.getValue()) && L.f(getError(), date.getError());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        public final boolean getOnlyPastDates() {
            return this.onlyPastDates;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = (getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31;
            boolean z12 = this.onlyPastDates;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return ((((iHashCode + i12) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Date(item=" + getItem() + ", sectionId=" + getSectionId() + ", onlyPastDates=" + this.onlyPastDates + ", value=" + getValue() + ", error=" + ((Object) getError()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeInt(this.onlyPastDates ? 1 : 0);
            parcel.writeString(this.value);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public Date(@k h hVar, @k String str, boolean z12, @l String str2, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.onlyPastDates = z12;
            this.value = str2;
            this.error = charSequence;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$DateTime;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "value", "", "error", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$DateTime;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "getValue", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class DateTime extends FormItem {

        @k
        public static final Parcelable.Creator<DateTime> CREATOR = new Creator();

        @l
        private final CharSequence error;

        @k
        private final h item;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateTime> {
            @Override // android.os.Parcelable.Creator
            @k
            public final DateTime createFromParcel(@k Parcel parcel) {
                return new DateTime((h) parcel.readParcelable(DateTime.class.getClassLoader()), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final DateTime[] newArray(int i12) {
                return new DateTime[i12];
            }
        }

        public /* synthetic */ DateTime(h hVar, String str, String str2, CharSequence charSequence, int i12, C42822w c42822w) {
            this(hVar, str, str2, (i12 & 8) != 0 ? null : charSequence);
        }

        public static /* synthetic */ DateTime copy$default(DateTime dateTime, h hVar, String str, String str2, CharSequence charSequence, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = dateTime.getItem();
            }
            if ((i12 & 2) != 0) {
                str = dateTime.getSectionId();
            }
            if ((i12 & 4) != 0) {
                str2 = dateTime.getValue();
            }
            if ((i12 & 8) != 0) {
                charSequence = dateTime.getError();
            }
            return dateTime.copy(hVar, str, str2, charSequence);
        }

        @k
        public final DateTime copy(@k h item, @k String sectionId, @l String value, @l CharSequence error) {
            return new DateTime(item, sectionId, value, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTime)) {
                return false;
            }
            DateTime dateTime = (DateTime) other;
            return L.f(getItem(), dateTime.getItem()) && L.f(getSectionId(), dateTime.getSectionId()) && L.f(getValue(), dateTime.getValue()) && L.f(getError(), dateTime.getError());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "DateTime(item=" + getItem() + ", sectionId=" + getSectionId() + ", value=" + getValue() + ", error=" + ((Object) getError()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeString(this.value);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public DateTime(@k h hVar, @k String str, @l String str2, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.value = str2;
            this.error = charSequence;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Description;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "text", "sectionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getSectionId", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Description extends FormItem {

        @k
        public static final Parcelable.Creator<Description> CREATOR = new Creator();

        @k
        private final String sectionId;

        @l
        private final String text;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Description> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Description createFromParcel(@k Parcel parcel) {
                return new Description(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Description[] newArray(int i12) {
                return new Description[i12];
            }
        }

        public Description(@l String str, @k String str2) {
            super(str2, new h("description_" + s.a(FormItem.INSTANCE), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 508, (C42822w) null), null, null, false, null, null, false, 252, null);
            this.text = str;
            this.sectionId = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Description)) {
                return false;
            }
            Description description = (Description) other;
            return L.f(this.text, description.text) && L.f(getSectionId(), description.getSectionId());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        public int hashCode() {
            String str = this.text;
            return getSectionId().hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Description(text=" + this.text + ", sectionId=" + getSectionId() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.sectionId);
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Hidden;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "sectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Hidden extends FormItem {

        @k
        public static final Parcelable.Creator<Hidden> CREATOR = new Creator();

        @k
        private final h item;

        @k
        private final String sectionId;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Hidden> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Hidden createFromParcel(@k Parcel parcel) {
                return new Hidden(parcel.readString(), (h) parcel.readParcelable(Hidden.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Hidden[] newArray(int i12) {
                return new Hidden[i12];
            }
        }

        public Hidden(@k String str, @k h hVar) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.sectionId = str;
            this.item = hVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hidden)) {
                return false;
            }
            Hidden hidden = (Hidden) other;
            return L.f(getSectionId(), hidden.getSectionId()) && L.f(getItem(), hidden.getItem());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        public int hashCode() {
            return getItem().hashCode() + (getSectionId().hashCode() * 31);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Hidden(sectionId=" + getSectionId() + ", item=" + getItem() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.sectionId);
            parcel.writeParcelable(this.item, flags);
        }
    }

    /* compiled from: FormItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ItemState {
        DEFAULT,
        LOADING
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010,¨\u0006-"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiSelect;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "", "values", "", "error", "", "isMultivalued", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/util/List;Ljava/lang/CharSequence;Z)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/util/List;Ljava/lang/CharSequence;Z)Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiSelect;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "Z", "()Z", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class MultiSelect extends FormItem {

        @k
        public static final Parcelable.Creator<MultiSelect> CREATOR = new Creator();

        @l
        private final CharSequence error;
        private final boolean isMultivalued;

        @k
        private final h item;

        @k
        private final String sectionId;

        @l
        private final List<String> values;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiSelect> {
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiSelect createFromParcel(@k Parcel parcel) {
                return new MultiSelect((h) parcel.readParcelable(MultiSelect.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final MultiSelect[] newArray(int i12) {
                return new MultiSelect[i12];
            }
        }

        public /* synthetic */ MultiSelect(h hVar, String str, List list, CharSequence charSequence, boolean z12, int i12, C42822w c42822w) {
            this(hVar, str, list, (i12 & 8) != 0 ? null : charSequence, (i12 & 16) != 0 ? true : z12);
        }

        public static /* synthetic */ MultiSelect copy$default(MultiSelect multiSelect, h hVar, String str, List list, CharSequence charSequence, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = multiSelect.getItem();
            }
            if ((i12 & 2) != 0) {
                str = multiSelect.getSectionId();
            }
            String str2 = str;
            if ((i12 & 4) != 0) {
                list = multiSelect.getValues();
            }
            List list2 = list;
            if ((i12 & 8) != 0) {
                charSequence = multiSelect.getError();
            }
            CharSequence charSequence2 = charSequence;
            if ((i12 & 16) != 0) {
                z12 = multiSelect.getIsMultivalued();
            }
            return multiSelect.copy(hVar, str2, list2, charSequence2, z12);
        }

        @k
        public final MultiSelect copy(@k h item, @k String sectionId, @l List<String> values, @l CharSequence error, boolean isMultivalued) {
            return new MultiSelect(item, sectionId, values, error, isMultivalued);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiSelect)) {
                return false;
            }
            MultiSelect multiSelect = (MultiSelect) other;
            return L.f(getItem(), multiSelect.getItem()) && L.f(getSectionId(), multiSelect.getSectionId()) && L.f(getValues(), multiSelect.getValues()) && L.f(getError(), multiSelect.getError()) && getIsMultivalued() == multiSelect.getIsMultivalued();
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = (((((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValues() == null ? 0 : getValues().hashCode())) * 31) + (getError() != null ? getError().hashCode() : 0)) * 31;
            boolean isMultivalued = getIsMultivalued();
            int i12 = isMultivalued;
            if (isMultivalued) {
                i12 = 1;
            }
            return iHashCode + i12;
        }

        /* renamed from: isMultivalued, reason: from getter */
        public boolean getIsMultivalued() {
            return this.isMultivalued;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "MultiSelect(item=" + getItem() + ", sectionId=" + getSectionId() + ", values=" + getValues() + ", error=" + ((Object) getError()) + ", isMultivalued=" + getIsMultivalued() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeStringList(this.values);
            TextUtils.writeToParcel(this.error, parcel, flags);
            parcel.writeInt(this.isMultivalued ? 1 : 0);
        }

        public MultiSelect(@k h hVar, @k String str, @l List<String> list, @l CharSequence charSequence, boolean z12) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.values = list;
            this.error = charSequence;
            this.isMultivalued = z12;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u0002`\u0007\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0086\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u0002`\u00072\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b/\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "sectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "countriesMap", "Lru/cyberity/cbr/core/data/model/remote/c;", "Lru/cyberity/cbr/core/data/model/PhoneCountryCodeWithMasks;", "phoneMaskMap", "defaultCountry", "", "skipInvalidValues", "value", "", "error", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;)V", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$Phone;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/util/Map;", "getCountriesMap", "()Ljava/util/Map;", "getPhoneMaskMap", "getDefaultCountry", "Z", "getSkipInvalidValues", "()Z", "getValue", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Phone extends FormItem {

        @k
        public static final Parcelable.Creator<Phone> CREATOR = new Creator();

        @k
        private final Map<String, String> countriesMap;

        @l
        private final String defaultCountry;

        @l
        private final CharSequence error;

        @k
        private final h item;

        @k
        private final Map<String, c> phoneMaskMap;

        @k
        private final String sectionId;
        private final boolean skipInvalidValues;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Phone> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Phone createFromParcel(@k Parcel parcel) {
                String string;
                String string2 = parcel.readString();
                h hVar = (h) parcel.readParcelable(Phone.class.getClassLoader());
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                int iC2 = 0;
                while (true) {
                    string = parcel.readString();
                    if (iC2 == i13) {
                        break;
                    }
                    iC2 = f.c(Phone.class, parcel, linkedHashMap2, string, iC2, 1);
                }
                return new Phone(string2, hVar, linkedHashMap, linkedHashMap2, string, parcel.readInt() != 0, parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Phone[] newArray(int i12) {
                return new Phone[i12];
            }
        }

        public /* synthetic */ Phone(String str, h hVar, Map map, Map map2, String str2, boolean z12, String str3, CharSequence charSequence, int i12, C42822w c42822w) {
            this(str, hVar, map, map2, str2, (i12 & 32) != 0 ? false : z12, str3, (i12 & 128) != 0 ? null : charSequence);
        }

        @k
        public final Phone copy(@k String sectionId, @k h item, @k Map<String, String> countriesMap, @k Map<String, c> phoneMaskMap, @l String defaultCountry, boolean skipInvalidValues, @l String value, @l CharSequence error) {
            return new Phone(sectionId, item, countriesMap, phoneMaskMap, defaultCountry, skipInvalidValues, value, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return L.f(getSectionId(), phone.getSectionId()) && L.f(getItem(), phone.getItem()) && L.f(this.countriesMap, phone.countriesMap) && L.f(this.phoneMaskMap, phone.phoneMaskMap) && L.f(this.defaultCountry, phone.defaultCountry) && this.skipInvalidValues == phone.skipInvalidValues && L.f(getValue(), phone.getValue()) && L.f(getError(), phone.getError());
        }

        @k
        public final Map<String, String> getCountriesMap() {
            return this.countriesMap;
        }

        @l
        public final String getDefaultCountry() {
            return this.defaultCountry;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @k
        public final Map<String, c> getPhoneMaskMap() {
            return this.phoneMaskMap;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        public final boolean getSkipInvalidValues() {
            return this.skipInvalidValues;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iC2 = AK.c.c(AK.c.c((getItem().hashCode() + (getSectionId().hashCode() * 31)) * 31, 31, this.countriesMap), 31, this.phoneMaskMap);
            String str = this.defaultCountry;
            int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
            boolean z12 = this.skipInvalidValues;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            return ((((iHashCode + i12) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return s.a(this) + " (s=" + getSectionId() + ", i=" + getItem() + ", v=" + getValue() + ", countries=" + this.countriesMap.size() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.sectionId);
            parcel.writeParcelable(this.item, flags);
            Iterator itI = C0.i(parcel, this.countriesMap);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
            Iterator itI2 = C0.i(parcel, this.phoneMaskMap);
            while (itI2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeParcelable((Parcelable) entry2.getValue(), flags);
            }
            parcel.writeString(this.defaultCountry);
            parcel.writeInt(this.skipInvalidValues ? 1 : 0);
            parcel.writeString(this.value);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public Phone(@k String str, @k h hVar, @k Map<String, String> map, @k Map<String, c> map2, @l String str2, boolean z12, @l String str3, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.sectionId = str;
            this.item = hVar;
            this.countriesMap = map;
            this.phoneMaskMap = map2;
            this.defaultCountry = str2;
            this.skipInvalidValues = z12;
            this.value = str3;
            this.error = charSequence;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\t¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Section;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Section extends FormItem {

        @k
        public static final Parcelable.Creator<Section> CREATOR = new Creator();

        @k
        private final h item;

        @k
        private final String sectionId;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Section> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Section createFromParcel(@k Parcel parcel) {
                return new Section((h) parcel.readParcelable(Section.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Section[] newArray(int i12) {
                return new Section[i12];
            }
        }

        public Section(@k h hVar, @k String str) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return L.f(getItem(), section.getItem()) && L.f(getSectionId(), section.getSectionId());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        public int hashCode() {
            return getSectionId().hashCode() + (getItem().hashCode() * 31);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Section(item=" + getItem() + ", sectionId=" + getSectionId() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Select;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "value", "", "error", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$Select;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "getValue", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Select extends FormItem {

        @k
        public static final Parcelable.Creator<Select> CREATOR = new Creator();

        @l
        private final CharSequence error;

        @k
        private final h item;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Select> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Select createFromParcel(@k Parcel parcel) {
                return new Select((h) parcel.readParcelable(Select.class.getClassLoader()), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Select[] newArray(int i12) {
                return new Select[i12];
            }
        }

        public /* synthetic */ Select(h hVar, String str, String str2, CharSequence charSequence, int i12, C42822w c42822w) {
            this(hVar, str, str2, (i12 & 8) != 0 ? null : charSequence);
        }

        public static /* synthetic */ Select copy$default(Select select, h hVar, String str, String str2, CharSequence charSequence, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = select.getItem();
            }
            if ((i12 & 2) != 0) {
                str = select.getSectionId();
            }
            if ((i12 & 4) != 0) {
                str2 = select.getValue();
            }
            if ((i12 & 8) != 0) {
                charSequence = select.getError();
            }
            return select.copy(hVar, str, str2, charSequence);
        }

        @k
        public final Select copy(@k h item, @k String sectionId, @l String value, @l CharSequence error) {
            return new Select(item, sectionId, value, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return L.f(getItem(), select.getItem()) && L.f(getSectionId(), select.getSectionId()) && L.f(getValue(), select.getValue()) && L.f(getError(), select.getError());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Select(item=" + getItem() + ", sectionId=" + getSectionId() + ", value=" + getValue() + ", error=" + ((Object) getError()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeString(this.value);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public Select(@k h hVar, @k String str, @l String str2, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.value = str2;
            this.error = charSequence;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b\b\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$SelectDropdown;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "value", "", "isEnabled", "", "error", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$SelectDropdown;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "getValue", "Z", "()Z", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class SelectDropdown extends FormItem {

        @k
        public static final Parcelable.Creator<SelectDropdown> CREATOR = new Creator();

        @l
        private final CharSequence error;
        private final boolean isEnabled;

        @k
        private final h item;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectDropdown> {
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectDropdown createFromParcel(@k Parcel parcel) {
                return new SelectDropdown((h) parcel.readParcelable(SelectDropdown.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final SelectDropdown[] newArray(int i12) {
                return new SelectDropdown[i12];
            }
        }

        public /* synthetic */ SelectDropdown(h hVar, String str, String str2, boolean z12, CharSequence charSequence, int i12, C42822w c42822w) {
            this(hVar, str, str2, (i12 & 8) != 0 ? true : z12, (i12 & 16) != 0 ? null : charSequence);
        }

        public static /* synthetic */ SelectDropdown copy$default(SelectDropdown selectDropdown, h hVar, String str, String str2, boolean z12, CharSequence charSequence, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = selectDropdown.getItem();
            }
            if ((i12 & 2) != 0) {
                str = selectDropdown.getSectionId();
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                str2 = selectDropdown.getValue();
            }
            String str4 = str2;
            if ((i12 & 8) != 0) {
                z12 = selectDropdown.getIsEnabled();
            }
            boolean z13 = z12;
            if ((i12 & 16) != 0) {
                charSequence = selectDropdown.getError();
            }
            return selectDropdown.copy(hVar, str3, str4, z13, charSequence);
        }

        @k
        public final SelectDropdown copy(@k h item, @k String sectionId, @l String value, boolean isEnabled, @l CharSequence error) {
            return new SelectDropdown(item, sectionId, value, isEnabled, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectDropdown)) {
                return false;
            }
            SelectDropdown selectDropdown = (SelectDropdown) other;
            return L.f(getItem(), selectDropdown.getItem()) && L.f(getSectionId(), selectDropdown.getSectionId()) && L.f(getValue(), selectDropdown.getValue()) && getIsEnabled() == selectDropdown.getIsEnabled() && L.f(getError(), selectDropdown.getError());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = (((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31;
            boolean isEnabled = getIsEnabled();
            int i12 = isEnabled;
            if (isEnabled) {
                i12 = 1;
            }
            return ((iHashCode + i12) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        /* renamed from: isEnabled, reason: from getter */
        public boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "SelectDropdown(item=" + getItem() + ", sectionId=" + getSectionId() + ", value=" + getValue() + ", isEnabled=" + getIsEnabled() + ", error=" + ((Object) getError()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeString(this.value);
            parcel.writeInt(this.isEnabled ? 1 : 0);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public SelectDropdown(@k h hVar, @k String str, @l String str2, boolean z12, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.value = str2;
            this.isEnabled = z12;
            this.error = charSequence;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Subtitle;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "text", "sectionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getSectionId", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Subtitle extends FormItem {

        @k
        public static final Parcelable.Creator<Subtitle> CREATOR = new Creator();

        @k
        private final String sectionId;

        @l
        private final String text;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Subtitle> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Subtitle createFromParcel(@k Parcel parcel) {
                return new Subtitle(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Subtitle[] newArray(int i12) {
                return new Subtitle[i12];
            }
        }

        public Subtitle(@l String str, @k String str2) {
            super(str2, new h("subtitle_" + s.a(FormItem.INSTANCE), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 508, (C42822w) null), null, null, false, null, null, false, 252, null);
            this.text = str;
            this.sectionId = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) other;
            return L.f(this.text, subtitle.text) && L.f(getSectionId(), subtitle.getSectionId());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        public int hashCode() {
            String str = this.text;
            return getSectionId().hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Subtitle(text=" + this.text + ", sectionId=" + getSectionId() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.sectionId);
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJX\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Text;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "value", "", "isEnabled", "", "error", "", "masks", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/CharSequence;Ljava/util/List;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$Text;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "getValue", "Z", "()Z", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "Ljava/util/List;", "getMasks", "()Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class Text extends FormItem {

        @k
        public static final Parcelable.Creator<Text> CREATOR = new Creator();

        @l
        private final CharSequence error;
        private final boolean isEnabled;

        @k
        private final h item;

        @l
        private final List<String> masks;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Text> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Text createFromParcel(@k Parcel parcel) {
                return new Text((h) parcel.readParcelable(Text.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Text[] newArray(int i12) {
                return new Text[i12];
            }
        }

        public /* synthetic */ Text(h hVar, String str, String str2, boolean z12, CharSequence charSequence, List list, int i12, C42822w c42822w) {
            this(hVar, str, str2, (i12 & 8) != 0 ? true : z12, (i12 & 16) != 0 ? null : charSequence, (i12 & 32) != 0 ? null : list);
        }

        public static /* synthetic */ Text copy$default(Text text, h hVar, String str, String str2, boolean z12, CharSequence charSequence, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = text.getItem();
            }
            if ((i12 & 2) != 0) {
                str = text.getSectionId();
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                str2 = text.getValue();
            }
            String str4 = str2;
            if ((i12 & 8) != 0) {
                z12 = text.getIsEnabled();
            }
            boolean z13 = z12;
            if ((i12 & 16) != 0) {
                charSequence = text.getError();
            }
            CharSequence charSequence2 = charSequence;
            if ((i12 & 32) != 0) {
                list = text.masks;
            }
            return text.copy(hVar, str3, str4, z13, charSequence2, list);
        }

        @k
        public final Text copy(@k h item, @k String sectionId, @l String value, boolean isEnabled, @l CharSequence error, @l List<String> masks) {
            return new Text(item, sectionId, value, isEnabled, error, masks);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return L.f(getItem(), text.getItem()) && L.f(getSectionId(), text.getSectionId()) && L.f(getValue(), text.getValue()) && getIsEnabled() == text.getIsEnabled() && L.f(getError(), text.getError()) && L.f(this.masks, text.masks);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @l
        public final List<String> getMasks() {
            return this.masks;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = (((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31;
            boolean isEnabled = getIsEnabled();
            int i12 = isEnabled;
            if (isEnabled) {
                i12 = 1;
            }
            int iHashCode2 = (((iHashCode + i12) * 31) + (getError() == null ? 0 : getError().hashCode())) * 31;
            List<String> list = this.masks;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        /* renamed from: isEnabled, reason: from getter */
        public boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Text(item=");
            sb2.append(getItem());
            sb2.append(", sectionId=");
            sb2.append(getSectionId());
            sb2.append(", value=");
            sb2.append(getValue());
            sb2.append(", isEnabled=");
            sb2.append(getIsEnabled());
            sb2.append(", error=");
            sb2.append((Object) getError());
            sb2.append(", masks=");
            return H.p(sb2, this.masks, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeString(this.value);
            parcel.writeInt(this.isEnabled ? 1 : 0);
            TextUtils.writeToParcel(this.error, parcel, flags);
            parcel.writeStringList(this.masks);
        }

        public Text(@k h hVar, @k String str, @l String str2, boolean z12, @l CharSequence charSequence, @l List<String> list) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.value = str2;
            this.isEnabled = z12;
            this.error = charSequence;
            this.masks = list;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$TextArea;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "value", "", "error", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$TextArea;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "getValue", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class TextArea extends FormItem {

        @k
        public static final Parcelable.Creator<TextArea> CREATOR = new Creator();

        @l
        private final CharSequence error;

        @k
        private final h item;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextArea> {
            @Override // android.os.Parcelable.Creator
            @k
            public final TextArea createFromParcel(@k Parcel parcel) {
                return new TextArea((h) parcel.readParcelable(TextArea.class.getClassLoader()), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final TextArea[] newArray(int i12) {
                return new TextArea[i12];
            }
        }

        public /* synthetic */ TextArea(h hVar, String str, String str2, CharSequence charSequence, int i12, C42822w c42822w) {
            this(hVar, str, str2, (i12 & 8) != 0 ? null : charSequence);
        }

        public static /* synthetic */ TextArea copy$default(TextArea textArea, h hVar, String str, String str2, CharSequence charSequence, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                hVar = textArea.getItem();
            }
            if ((i12 & 2) != 0) {
                str = textArea.getSectionId();
            }
            if ((i12 & 4) != 0) {
                str2 = textArea.getValue();
            }
            if ((i12 & 8) != 0) {
                charSequence = textArea.getError();
            }
            return textArea.copy(hVar, str, str2, charSequence);
        }

        @k
        public final TextArea copy(@k h item, @k String sectionId, @l String value, @l CharSequence error) {
            return new TextArea(item, sectionId, value, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextArea)) {
                return false;
            }
            TextArea textArea = (TextArea) other;
            return L.f(getItem(), textArea.getItem()) && L.f(getSectionId(), textArea.getSectionId()) && L.f(getValue(), textArea.getValue()) && L.f(getError(), textArea.getError());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return ((((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "TextArea(item=" + getItem() + ", sectionId=" + getSectionId() + ", value=" + getValue() + ", error=" + ((Object) getError()) + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeString(this.value);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public TextArea(@k h hVar, @k String str, @l String str2, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.value = str2;
            this.error = charSequence;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$Title;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "text", "sectionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getSectionId", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Title extends FormItem {

        @k
        public static final Parcelable.Creator<Title> CREATOR = new Creator();

        @k
        private final String sectionId;

        @l
        private final String text;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Title> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Title createFromParcel(@k Parcel parcel) {
                return new Title(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Title[] newArray(int i12) {
                return new Title[i12];
            }
        }

        public Title(@l String str, @k String str2) {
            super(str2, new h("title_" + s.a(FormItem.INSTANCE), str, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 508, (C42822w) null), null, null, false, null, null, false, 252, null);
            this.text = str;
            this.sectionId = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return L.f(this.text, title.text) && L.f(getSectionId(), title.getSectionId());
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        public int hashCode() {
            String str = this.text;
            return getSectionId().hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return "Title(text=" + this.text + ", sectionId=" + getSectionId() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.sectionId);
        }
    }

    public /* synthetic */ FormItem(String str, h hVar, String str2, List list, boolean z12, CharSequence charSequence, String str3, boolean z13, C42822w c42822w) {
        this(str, hVar, str2, list, z12, charSequence, str3, z13);
    }

    @l
    public String getCondition() {
        return this.condition;
    }

    @l
    public CharSequence getError() {
        return this.error;
    }

    @k
    public final String getFormItemId() {
        String strP = getItem().getId();
        return strP == null ? s.a(this) : strP;
    }

    @k
    public h getItem() {
        return this.item;
    }

    @l
    public String getSectionId() {
        return this.sectionId;
    }

    @l
    public String getValue() {
        return this.value;
    }

    @l
    public List<String> getValues() {
        return this.values;
    }

    /* renamed from: isEnabled, reason: from getter */
    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean isRequired() {
        return L.f(getItem().getRequired(), Boolean.TRUE);
    }

    public void setCondition(@l String str) {
        this.condition = str;
    }

    @k
    public final String toShortString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s.a(this));
        sb2.append(" (");
        sb2.append(getSectionId());
        sb2.append('.');
        sb2.append(getItem().getId());
        sb2.append(", isRequired=");
        sb2.append(getItem().getRequired());
        sb2.append(", hasValue=");
        String value = getValue();
        sb2.append(!(value == null || value.length() == 0));
        sb2.append("), hasValues=");
        List<String> values = getValues();
        return r.x(sb2, !(values == null || values.isEmpty()), ')');
    }

    @k
    public String toString() {
        return s.a(this) + ", " + getSectionId() + '.' + getItem().getId();
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u0002`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J`\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u0002`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b\u000b\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$CountrySelect;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "", "sectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "Lru/cyberity/cbr/core/data/model/CountryCodeToNameMap;", "countriesMap", "value", "", "isEnabled", "", "error", "<init>", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;)V", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/CharSequence;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$CountrySelect;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSectionId", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/util/Map;", "getCountriesMap", "()Ljava/util/Map;", "getValue", "Z", "()Z", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class CountrySelect extends FormItem {

        @k
        public static final Parcelable.Creator<CountrySelect> CREATOR = new Creator();

        @k
        private final Map<String, String> countriesMap;

        @l
        private final CharSequence error;
        private final boolean isEnabled;

        @k
        private final h item;

        @k
        private final String sectionId;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CountrySelect> {
            @Override // android.os.Parcelable.Creator
            @k
            public final CountrySelect createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                h hVar = (h) parcel.readParcelable(CountrySelect.class.getClassLoader());
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
                return new CountrySelect(string, hVar, linkedHashMap, parcel.readString(), parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final CountrySelect[] newArray(int i12) {
                return new CountrySelect[i12];
            }
        }

        public /* synthetic */ CountrySelect(String str, h hVar, Map map, String str2, boolean z12, CharSequence charSequence, int i12, C42822w c42822w) {
            this(str, hVar, (i12 & 4) != 0 ? P0.c() : map, str2, (i12 & 16) != 0 ? true : z12, (i12 & 32) != 0 ? null : charSequence);
        }

        public static /* synthetic */ CountrySelect copy$default(CountrySelect countrySelect, String str, h hVar, Map map, String str2, boolean z12, CharSequence charSequence, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = countrySelect.getSectionId();
            }
            if ((i12 & 2) != 0) {
                hVar = countrySelect.getItem();
            }
            h hVar2 = hVar;
            if ((i12 & 4) != 0) {
                map = countrySelect.countriesMap;
            }
            Map map2 = map;
            if ((i12 & 8) != 0) {
                str2 = countrySelect.getValue();
            }
            String str3 = str2;
            if ((i12 & 16) != 0) {
                z12 = countrySelect.getIsEnabled();
            }
            boolean z13 = z12;
            if ((i12 & 32) != 0) {
                charSequence = countrySelect.getError();
            }
            return countrySelect.copy(str, hVar2, map2, str3, z13, charSequence);
        }

        @k
        public final CountrySelect copy(@k String sectionId, @k h item, @k Map<String, String> countriesMap, @l String value, boolean isEnabled, @l CharSequence error) {
            return new CountrySelect(sectionId, item, countriesMap, value, isEnabled, error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountrySelect)) {
                return false;
            }
            CountrySelect countrySelect = (CountrySelect) other;
            return L.f(getSectionId(), countrySelect.getSectionId()) && L.f(getItem(), countrySelect.getItem()) && L.f(this.countriesMap, countrySelect.countriesMap) && L.f(getValue(), countrySelect.getValue()) && getIsEnabled() == countrySelect.getIsEnabled() && L.f(getError(), countrySelect.getError());
        }

        @k
        public final Map<String, String> getCountriesMap() {
            return this.countriesMap;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iC2 = (AK.c.c((getItem().hashCode() + (getSectionId().hashCode() * 31)) * 31, 31, this.countriesMap) + (getValue() == null ? 0 : getValue().hashCode())) * 31;
            boolean isEnabled = getIsEnabled();
            int i12 = isEnabled;
            if (isEnabled) {
                i12 = 1;
            }
            return ((iC2 + i12) * 31) + (getError() != null ? getError().hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        /* renamed from: isEnabled, reason: from getter */
        public boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            return s.a(this) + "(s=" + getSectionId() + ", i=" + getItem() + ", v=" + getValue() + ", countries=" + this.countriesMap.size() + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.sectionId);
            parcel.writeParcelable(this.item, flags);
            Iterator itI = C0.i(parcel, this.countriesMap);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
            parcel.writeString(this.value);
            parcel.writeInt(this.isEnabled ? 1 : 0);
            TextUtils.writeToParcel(this.error, parcel, flags);
        }

        public CountrySelect(@k String str, @k h hVar, @k Map<String, String> map, @l String str2, boolean z12, @l CharSequence charSequence) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.sectionId = str;
            this.item = hVar;
            this.countriesMap = map;
            this.value = str2;
            this.isEnabled = z12;
            this.error = charSequence;
        }
    }

    private FormItem(String str, h hVar, String str2, List<String> list, boolean z12, CharSequence charSequence, String str3, boolean z13) {
        this.sectionId = str;
        this.item = hVar;
        this.value = str2;
        this.values = list;
        this.isEnabled = z12;
        this.error = charSequence;
        this.condition = str3;
        this.isMultivalued = z13;
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJh\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b1\u0010\u0013¨\u00062"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$FileAttachment;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "value", "hint", "", "error", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "fileState", VoiceInfo.STATE, "previewUrl", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;Ljava/lang/String;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$FileAttachment;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "getValue", "getHint", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "getFileState", "()Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "getState", "getPreviewUrl", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class FileAttachment extends FormItem {

        @k
        public static final Parcelable.Creator<FileAttachment> CREATOR = new Creator();

        @l
        private final CharSequence error;

        @k
        private final ItemState fileState;

        @l
        private final String hint;

        @k
        private final h item;

        @l
        private final String previewUrl;

        @k
        private final String sectionId;

        @k
        private final ItemState state;

        @l
        private final String value;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FileAttachment> {
            @Override // android.os.Parcelable.Creator
            @k
            public final FileAttachment createFromParcel(@k Parcel parcel) {
                return new FileAttachment((h) parcel.readParcelable(FileAttachment.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), ItemState.valueOf(parcel.readString()), ItemState.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final FileAttachment[] newArray(int i12) {
                return new FileAttachment[i12];
            }
        }

        public /* synthetic */ FileAttachment(h hVar, String str, String str2, String str3, CharSequence charSequence, ItemState itemState, ItemState itemState2, String str4, int i12, C42822w c42822w) {
            this(hVar, str, (i12 & 4) != 0 ? null : str2, str3, (i12 & 16) != 0 ? null : charSequence, (i12 & 32) != 0 ? ItemState.DEFAULT : itemState, (i12 & 64) != 0 ? ItemState.DEFAULT : itemState2, (i12 & 128) != 0 ? null : str4);
        }

        @k
        public final FileAttachment copy(@k h item, @k String sectionId, @l String value, @l String hint, @l CharSequence error, @k ItemState fileState, @k ItemState state, @l String previewUrl) {
            return new FileAttachment(item, sectionId, value, hint, error, fileState, state, previewUrl);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileAttachment)) {
                return false;
            }
            FileAttachment fileAttachment = (FileAttachment) other;
            return L.f(getItem(), fileAttachment.getItem()) && L.f(getSectionId(), fileAttachment.getSectionId()) && L.f(getValue(), fileAttachment.getValue()) && L.f(this.hint, fileAttachment.hint) && L.f(getError(), fileAttachment.getError()) && this.fileState == fileAttachment.fileState && this.state == fileAttachment.state && L.f(this.previewUrl, fileAttachment.previewUrl);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @k
        public final ItemState getFileState() {
            return this.fileState;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @l
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @k
        public final ItemState getState() {
            return this.state;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = (((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31;
            String str = this.hint;
            int iHashCode2 = (this.state.hashCode() + ((this.fileState.hashCode() + ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (getError() == null ? 0 : getError().hashCode())) * 31)) * 31)) * 31;
            String str2 = this.previewUrl;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FileAttachment(item=");
            sb2.append(getItem());
            sb2.append(", sectionId=");
            sb2.append(getSectionId());
            sb2.append(", value=");
            sb2.append(getValue());
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", error=");
            sb2.append((Object) getError());
            sb2.append(", fileState=");
            sb2.append(this.fileState);
            sb2.append(", state=");
            sb2.append(this.state);
            sb2.append(", previewUrl=");
            return C22026a.c(sb2, this.previewUrl, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeString(this.value);
            parcel.writeString(this.hint);
            TextUtils.writeToParcel(this.error, parcel, flags);
            parcel.writeString(this.fileState.name());
            parcel.writeString(this.state.name());
            parcel.writeString(this.previewUrl);
        }

        public FileAttachment(@k h hVar, @k String str, @l String str2, @l String str3, @l CharSequence charSequence, @k ItemState itemState, @k ItemState itemState2, @l String str4) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.value = str2;
            this.hint = str3;
            this.error = charSequence;
            this.fileState = itemState;
            this.state = itemState2;
            this.previewUrl = str4;
        }
    }

    /* compiled from: FormItem.kt */
    @d
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u008a\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0017R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b.\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b\f\u00103R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b4\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "item", "", "sectionId", "", "values", "hint", "", "error", "", "isMultivalued", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "fileStates", VoiceInfo.STATE, "", "previewUrls", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/CharSequence;ZLjava/util/List;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;)V", "copy", "(Lru/cyberity/cbr/core/data/source/applicant/remote/h;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/CharSequence;ZLjava/util/List;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;Ljava/util/Map;)Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "getItem", "()Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "Ljava/lang/String;", "getSectionId", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "getHint", "Ljava/lang/CharSequence;", "getError", "()Ljava/lang/CharSequence;", "Z", "()Z", "getFileStates", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "getState", "()Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "Ljava/util/Map;", "getPreviewUrls", "()Ljava/util/Map;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class MultiFileAttachments extends FormItem {

        @k
        public static final Parcelable.Creator<MultiFileAttachments> CREATOR = new Creator();

        @l
        private final CharSequence error;

        @k
        private final List<ItemState> fileStates;

        @l
        private final String hint;
        private final boolean isMultivalued;

        @k
        private final h item;

        @l
        private final Map<String, String> previewUrls;

        @k
        private final String sectionId;

        @k
        private final ItemState state;

        @l
        private final List<String> values;

        /* compiled from: FormItem.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiFileAttachments> {
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiFileAttachments createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                h hVar = (h) parcel.readParcelable(MultiFileAttachments.class.getClassLoader());
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string2 = parcel.readString();
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                int iA2 = 0;
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(ItemState.valueOf(parcel.readString()));
                }
                ItemState itemStateValueOf = ItemState.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i14 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i14);
                    while (iA2 != i14) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                }
                return new MultiFileAttachments(hVar, string, arrayListCreateStringArrayList, string2, charSequence, z12, arrayList, itemStateValueOf, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final MultiFileAttachments[] newArray(int i12) {
                return new MultiFileAttachments[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MultiFileAttachments(@k h hVar, @k String str, @l List<String> list, @l String str2, @l CharSequence charSequence, boolean z12, @k List<? extends ItemState> list2, @k ItemState itemState, @l Map<String, String> map) {
            super(str, hVar, null, null, false, null, null, false, 252, null);
            this.item = hVar;
            this.sectionId = str;
            this.values = list;
            this.hint = str2;
            this.error = charSequence;
            this.isMultivalued = z12;
            this.fileStates = list2;
            this.state = itemState;
            this.previewUrls = map;
        }

        @k
        public final MultiFileAttachments copy(@k h item, @k String sectionId, @l List<String> values, @l String hint, @l CharSequence error, boolean isMultivalued, @k List<? extends ItemState> fileStates, @k ItemState state, @l Map<String, String> previewUrls) {
            return new MultiFileAttachments(item, sectionId, values, hint, error, isMultivalued, fileStates, state, previewUrls);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiFileAttachments)) {
                return false;
            }
            MultiFileAttachments multiFileAttachments = (MultiFileAttachments) other;
            return L.f(getItem(), multiFileAttachments.getItem()) && L.f(getSectionId(), multiFileAttachments.getSectionId()) && L.f(getValues(), multiFileAttachments.getValues()) && L.f(this.hint, multiFileAttachments.hint) && L.f(getError(), multiFileAttachments.getError()) && getIsMultivalued() == multiFileAttachments.getIsMultivalued() && L.f(this.fileStates, multiFileAttachments.fileStates) && this.state == multiFileAttachments.state && L.f(this.previewUrls, multiFileAttachments.previewUrls);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public CharSequence getError() {
            return this.error;
        }

        @k
        public final List<ItemState> getFileStates() {
            return this.fileStates;
        }

        @l
        public final String getHint() {
            return this.hint;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public h getItem() {
            return this.item;
        }

        @l
        public final Map<String, String> getPreviewUrls() {
            return this.previewUrls;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String getSectionId() {
            return this.sectionId;
        }

        @k
        public final ItemState getState() {
            return this.state;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @l
        public List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            int iHashCode = (((getSectionId().hashCode() + (getItem().hashCode() * 31)) * 31) + (getValues() == null ? 0 : getValues().hashCode())) * 31;
            String str = this.hint;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (getError() == null ? 0 : getError().hashCode())) * 31;
            boolean isMultivalued = getIsMultivalued();
            int i12 = isMultivalued;
            if (isMultivalued) {
                i12 = 1;
            }
            int iHashCode3 = (this.state.hashCode() + H.e((iHashCode2 + i12) * 31, 31, this.fileStates)) * 31;
            Map<String, String> map = this.previewUrls;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        /* renamed from: isMultivalued, reason: from getter */
        public boolean getIsMultivalued() {
            return this.isMultivalued;
        }

        @Override // ru.cyberity.cbr.core.presentation.form.model.FormItem
        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MultiFileAttachments(item=");
            sb2.append(getItem());
            sb2.append(", sectionId=");
            sb2.append(getSectionId());
            sb2.append(", values=");
            sb2.append(getValues());
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", error=");
            sb2.append((Object) getError());
            sb2.append(", isMultivalued=");
            sb2.append(getIsMultivalued());
            sb2.append(", fileStates=");
            sb2.append(this.fileStates);
            sb2.append(", state=");
            sb2.append(this.state);
            sb2.append(", previewUrls=");
            return r.w(sb2, this.previewUrls, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.item, flags);
            parcel.writeString(this.sectionId);
            parcel.writeStringList(this.values);
            parcel.writeString(this.hint);
            TextUtils.writeToParcel(this.error, parcel, flags);
            parcel.writeInt(this.isMultivalued ? 1 : 0);
            Iterator itJ = C0.j(this.fileStates, parcel);
            while (itJ.hasNext()) {
                parcel.writeString(((ItemState) itJ.next()).name());
            }
            parcel.writeString(this.state.name());
            Map<String, String> map = this.previewUrls;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
        public MultiFileAttachments(h hVar, String str, List list, String str2, CharSequence charSequence, boolean z12, List list2, ItemState itemState, Map map, int i12, C42822w c42822w) {
            List list3;
            ?? arrayList;
            CharSequence charSequence2 = (i12 & 16) != 0 ? null : charSequence;
            boolean z13 = (i12 & 32) != 0 ? true : z12;
            if ((i12 & 64) != 0) {
                if (list != null) {
                    arrayList = new ArrayList(C42745f0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ItemState.DEFAULT);
                    }
                } else {
                    arrayList = C42784z0.f406748b;
                }
                list3 = arrayList;
            } else {
                list3 = list2;
            }
            this(hVar, str, list, str2, charSequence2, z13, list3, (i12 & 128) != 0 ? ItemState.DEFAULT : itemState, (i12 & 256) != 0 ? null : map);
        }
    }

    public /* synthetic */ FormItem(String str, h hVar, String str2, List list, boolean z12, CharSequence charSequence, String str3, boolean z13, int i12, C42822w c42822w) {
        this(str, hVar, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? true : z12, (i12 & 32) != 0 ? null : charSequence, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? false : z13, null);
    }
}
