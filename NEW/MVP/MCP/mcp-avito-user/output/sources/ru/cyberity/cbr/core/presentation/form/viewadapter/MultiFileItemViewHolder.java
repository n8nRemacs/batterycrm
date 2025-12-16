package ru.cyberity.cbr.core.presentation.form.viewadapter;

import Y41.a;
import Y61.k;
import Y61.l;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.presentation.form.FormFieldCallback;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataFileFieldView;

/* compiled from: MultiFileItemViewHolder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/viewadapter/MultiFileItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/viewadapter/FormItemViewHolder;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;", "Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;", "itemView", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "callback", "<init>", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "view", "item", "", "itemCount", "Lkotlin/G0;", "onBind", "(Lru/cyberity/cbr/core/widget/applicantData/CBRApplicantDataFileFieldView;Lru/cyberity/cbr/core/presentation/form/model/FormItem$MultiFileAttachments;I)V", "onRecycled", "()V", "Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "getCallback", "()Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;", "setCallback", "(Lru/cyberity/cbr/core/presentation/form/FormFieldCallback;)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class MultiFileItemViewHolder extends FormItemViewHolder<FormItem.MultiFileAttachments, CBRApplicantDataFileFieldView> {

    @l
    private FormFieldCallback callback;

    /* compiled from: MultiFileItemViewHolder.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormItem.ItemState.values().length];
            iArr[FormItem.ItemState.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MultiFileItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.MultiFileItemViewHolder$onBind$1, reason: invalid class name */
    public static final class AnonymousClass1 extends N implements a<G0> {
        final /* synthetic */ FormItem.MultiFileAttachments $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FormItem.MultiFileAttachments multiFileAttachments) {
            super(0);
            this.$item = multiFileAttachments;
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            invoke2();
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            FormFieldCallback callback = MultiFileItemViewHolder.this.getCallback();
            if (callback != null) {
                callback.onPickFileClick(this.$item);
            }
        }
    }

    /* compiled from: MultiFileItemViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fileId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.form.viewadapter.MultiFileItemViewHolder$onBind$2, reason: invalid class name */
    public static final class AnonymousClass2 extends N implements Y41.l<String, G0> {
        final /* synthetic */ FormItem.MultiFileAttachments $item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FormItem.MultiFileAttachments multiFileAttachments) {
            super(1);
            this.$item = multiFileAttachments;
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            invoke2(str);
            return G0.f406611a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@k String str) {
            FormFieldCallback callback = MultiFileItemViewHolder.this.getCallback();
            if (callback != null) {
                callback.onDeleteFileClick(this.$item, str);
            }
        }
    }

    public MultiFileItemViewHolder(@k CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView, @l FormFieldCallback formFieldCallback) {
        super(cBRApplicantDataFileFieldView);
        this.callback = formFieldCallback;
    }

    @l
    public final FormFieldCallback getCallback() {
        return this.callback;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemViewHolder
    public void onRecycled() {
        View view = this.itemView;
        CBRApplicantDataFileFieldView cBRApplicantDataFileFieldView = view instanceof CBRApplicantDataFileFieldView ? (CBRApplicantDataFileFieldView) view : null;
        if (cBRApplicantDataFileFieldView != null) {
            cBRApplicantDataFileFieldView.cleanup();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.form.viewadapter.FormItemViewHolder
    public void onBind(@k CBRApplicantDataFileFieldView view, @k FormItem.MultiFileAttachments item, int itemCount) {
        view.setPickFileClickListener(new AnonymousClass1(item));
        view.setDeleteFileClickListener(new AnonymousClass2(item));
        CharSequence hint = item.getHint();
        if (hint == null) {
            hint = "";
        }
        view.setPickFileLabel(hint);
        view.setState(WhenMappings.$EnumSwitchMapping$0[item.getState().ordinal()] == 1 ? CBRApplicantDataFileFieldView.State.LOADING : CBRApplicantDataFileFieldView.State.DEFAULT);
        List<FormItem.ItemState> fileStates = item.getFileStates();
        ArrayList arrayList = new ArrayList(C42745f0.q(fileStates, 10));
        Iterator<T> it = fileStates.iterator();
        while (it.hasNext()) {
            arrayList.add(WhenMappings.$EnumSwitchMapping$0[((FormItem.ItemState) it.next()).ordinal()] == 1 ? CBRApplicantDataFileFieldView.State.LOADING : CBRApplicantDataFileFieldView.State.DEFAULT);
        }
        view.setItemStates(arrayList);
    }
}
