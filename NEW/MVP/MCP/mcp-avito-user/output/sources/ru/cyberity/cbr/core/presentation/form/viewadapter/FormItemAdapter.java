package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.Spanned;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.text.ParseException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.q;
import ru.cyberity.cbr.core.data.source.applicant.remote.h;
import ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerAdapter;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.FormItemValueProvider;
import ru.cyberity.cbr.core.presentation.form.FormItemViewUtilsKt;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.presentation.form.model.FormItemExtensionsKt;
import ru.cyberity.cbr.core.presentation.util.ApplicantDataFieldFormatUtilsKt;
import ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBaseFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataBoolFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataCalendarFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataDateTimeFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataDescriptionView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataMutilselectFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataPhoneFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataRadioGroupView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSectionView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionCountryFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSelectionFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataSubtitleView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataTextAreaFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataTitleView;

/* compiled from: FormItemAdapter.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u00182\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010)\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemAdapter;", "Lru/cyberity/cbr/core/presentation/base/adapter/CBRBaseRecyclerAdapter;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataBaseFieldView;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/ItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;", "valueProvider", "<init>", "(Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;)V", "", "oldList", "newList", "Landroidx/recyclerview/widget/o$b;", "provideDiffCallback", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/o$b;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "holder", "position", "Lkotlin/G0;", "onBindViewHolder", "(Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;I)V", "getItemViewType", "(I)I", "onViewRecycled", "(Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;)V", "Lru/cyberity/cbr/core/presentation/form/FormItemValueProvider;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/CallbackProxy;", "_callbackProxy", "Lru/cyberity/cbr/core/presentation/form/viewadapter/CallbackProxy;", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "value", "getCallback", "()Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "setCallback", "(Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "callback", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class FormItemAdapter extends CBRBaseRecyclerAdapter<FormItem, FormItemViewHolder<FormItem, CBRApplicantDataBaseFieldView>> {

    @l
    private CallbackProxy _callbackProxy;

    @k
    private final FormItemValueProvider valueProvider;

    /* compiled from: FormItemAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemAdapter$onBindViewHolder$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements Y41.l<String, G0> {
        final /* synthetic */ FormItem $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FormItem formItem) {
            super(1);
            this.$item = formItem;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k String str) {
            FormFieldCallback callback = FormItemAdapter.this.getCallback();
            if (callback != null) {
                callback.onLinkClick(this.$item, str);
            }
        }
    }

    public FormItemAdapter(@k FormItemValueProvider formItemValueProvider) {
        this.valueProvider = formItemValueProvider;
    }

    @l
    public final FormFieldCallback getCallback() {
        CallbackProxy callbackProxy = this._callbackProxy;
        if (callbackProxy != null) {
            return callbackProxy.getCallback();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return FormItemAdapterKt.asViewType(getItem(position));
    }

    @Override // ru.cyberity.cbr.core.presentation.base.adapter.CBRBaseRecyclerAdapter
    @k
    public C23424o.b provideDiffCallback(@k final List<? extends FormItem> oldList, @k final List<? extends FormItem> newList) {
        return new C23424o.b() { // from class: ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemAdapter.provideDiffCallback.1
            @Override // androidx.recyclerview.widget.C23424o.b
            public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                FormItem formItem = oldList.get(oldItemPosition);
                FormItem formItem2 = newList.get(newItemPosition);
                return formItem.getError() != null ? L.f(FormItemExtensionsKt.copyWithError(formItem, null), FormItemExtensionsKt.copyWithError(formItem2, null)) : formItem.equals(formItem2);
            }

            @Override // androidx.recyclerview.widget.C23424o.b
            public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                FormItem formItem = oldList.get(oldItemPosition);
                FormItem formItem2 = newList.get(newItemPosition);
                return L.f(formItem.getItem().getId(), formItem2.getItem().getId()) && L.f(formItem.getSectionId(), formItem2.getSectionId());
            }

            @Override // androidx.recyclerview.widget.C23424o.b
            public int getNewListSize() {
                return newList.size();
            }

            @Override // androidx.recyclerview.widget.C23424o.b
            public int getOldListSize() {
                return oldList.size();
            }
        };
    }

    public final void setCallback(@l FormFieldCallback formFieldCallback) {
        this._callbackProxy = null;
        if (formFieldCallback != null) {
            this._callbackProxy = new CallbackProxy(formFieldCallback);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@k FormItemViewHolder<FormItem, CBRApplicantDataBaseFieldView> holder, int position) throws ParseException {
        CharSequence required;
        String format;
        q qVarA;
        List<String> masks;
        Spanned spannedA;
        CallbackProxy callbackProxy = this._callbackProxy;
        if (callbackProxy != null) {
            callbackProxy.setDisabledCallbacks(true);
        }
        FormItem item = getItem(position);
        if (item == null) {
            throw new IllegalStateException("Required value was null.");
        }
        FormItem formItem = item;
        holder.bind((FormItemViewHolder<FormItem, CBRApplicantDataBaseFieldView>) formItem, getItemCount());
        CBRApplicantDataBaseFieldView formItemView = holder.getFormItemView();
        Context context = formItemView.getContext();
        h item2 = formItem.getItem();
        String title = item2.getTitle();
        if (title == null || (spannedA = s.a(title, context)) == null || (required = ExtensionsKt.formatRequired(spannedA, context, formItem.isRequired())) == null) {
            required = "";
        }
        formItemView.setLabel(required);
        String desc = item2.getDesc();
        formItemView.setExample(desc != null ? s.a(desc, context) : null);
        formItemView.setEnabled(formItem.getIsEnabled());
        formItemView.setHint(item2.getCom.avito.android.remote.model.messenger.context.ChannelContext.Item.PLACEHOLDER java.lang.String());
        formItemView.setOnLinkClicked(new AnonymousClass1(formItem));
        FormItemViewUtilsKt.setValueFromItem(formItemView, formItem, this.valueProvider);
        formItemView.setError(formItem.getError());
        if ((!(formItem instanceof FormItem.Text) || (masks = ((FormItem.Text) formItem).getMasks()) == null || masks.isEmpty()) && (format = formItem.getItem().getFormat()) != null && (qVarA = q.INSTANCE.a(format)) != null) {
            ApplicantDataFieldFormatUtilsKt.applyToEditText(qVarA, formItemView.getEditText());
        }
        CallbackProxy callbackProxy2 = this._callbackProxy;
        if (callbackProxy2 == null) {
            return;
        }
        callbackProxy2.setDisabledCallbacks(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @k
    public FormItemViewHolder<FormItem, CBRApplicantDataBaseFieldView> onCreateViewHolder(@k ViewGroup parent, int viewType) {
        FormItemViewHolder<FormItem, CBRApplicantDataBaseFieldView> titleViewHolder;
        switch (viewType) {
            case 0:
                titleViewHolder = new TitleViewHolder(new CBRApplicantDataTitleView(parent.getContext()));
                break;
            case 1:
                titleViewHolder = new SubtitleViewHolder(new CBRApplicantDataSubtitleView(parent.getContext()));
                break;
            case 2:
                titleViewHolder = new DescriptionViewHolder(new CBRApplicantDataDescriptionView(parent.getContext()));
                break;
            case 3:
            default:
                titleViewHolder = new DefaultFormItemViewHolder(new CBRApplicantDataFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 4:
                titleViewHolder = new SectionItemViewHolder(new CBRApplicantDataSectionView(parent.getContext(), null, 0, 0, 14, null));
                break;
            case 5:
                titleViewHolder = new DefaultFormItemViewHolder(new CBRApplicantDataFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 6:
                titleViewHolder = new CalendarItemViewHolder(new CBRApplicantDataCalendarFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 7:
                titleViewHolder = new TextAreaItemViewHolder(new CBRApplicantDataTextAreaFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 8:
                titleViewHolder = new BoolItemViewHolder(new CBRApplicantDataBoolFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 9:
                titleViewHolder = new DateTimeItemViewHolder(new CBRApplicantDataDateTimeFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 10:
                titleViewHolder = new PhoneItemViewHolder(new CBRApplicantDataPhoneFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 11:
                titleViewHolder = new CountrySelectItemViewHolder(new CBRApplicantDataSelectionCountryFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 12:
                titleViewHolder = new SelectionItemViewHolder(new CBRApplicantDataRadioGroupView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 13:
                titleViewHolder = new SelectDropdownItemViewHolder(new CBRApplicantDataSelectionFieldView(parent.getContext(), null, 0, 6, null), this._callbackProxy);
                break;
            case 14:
                titleViewHolder = new MultiselectItemViewHolder(new CBRApplicantDataMutilselectFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 15:
                titleViewHolder = new FileItemViewHolder(new CBRApplicantDataFileFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
            case 16:
                titleViewHolder = new MultiFileItemViewHolder(new CBRApplicantDataFileFieldView(parent.getContext(), null, 0, 0, 14, null), this._callbackProxy);
                break;
        }
        titleViewHolder.itemView.setLayoutParams(new RecyclerView.n(-1, -2));
        return titleViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@k FormItemViewHolder<FormItem, CBRApplicantDataBaseFieldView> holder) {
        super.onViewRecycled((FormItemAdapter) holder);
        holder.onRecycled();
    }
}
