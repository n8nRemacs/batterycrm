package ru.cyberity.cbr.core.presentation.support;

import AK.c;
import Y41.p;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.model.CBRSupportItem;
import ru.cyberity.cbr.core.data.source.extensions.a;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.widget.CBRStepState;

/* compiled from: CBRSupportViewModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$ViewState;", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "<init>", "(Lru/cyberity/cbr/core/data/source/extensions/a;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;)V", "getDefaultState", "()Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$ViewState;", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/extensions/a;", "SupportItem", "ViewState", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRSupportViewModel extends CBRViewModel<ViewState> {

    @k
    private final a extensionProvider;

    /* compiled from: CBRSupportViewModel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$SupportItem;", "", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "item", "Lru/cyberity/cbr/core/widget/CBRStepState;", "stepState", "Landroid/graphics/drawable/Drawable;", "icon", "", "title", "subtitle", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRSupportItem;Lru/cyberity/cbr/core/widget/CBRStepState;Landroid/graphics/drawable/Drawable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "getItem", "()Lru/cyberity/cbr/core/data/model/CBRSupportItem;", "Lru/cyberity/cbr/core/widget/CBRStepState;", "getStepState", "()Lru/cyberity/cbr/core/widget/CBRStepState;", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getSubtitle", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class SupportItem {

        @l
        private final Drawable icon;

        @k
        private final CBRSupportItem item;

        @k
        private final CBRStepState stepState;

        @l
        private final CharSequence subtitle;

        @l
        private final CharSequence title;

        public SupportItem(@k CBRSupportItem cBRSupportItem, @k CBRStepState cBRStepState, @l Drawable drawable, @l CharSequence charSequence, @l CharSequence charSequence2) {
            this.item = cBRSupportItem;
            this.stepState = cBRStepState;
            this.icon = drawable;
            this.title = charSequence;
            this.subtitle = charSequence2;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportItem)) {
                return false;
            }
            SupportItem supportItem = (SupportItem) other;
            return L.f(this.item, supportItem.item) && this.stepState == supportItem.stepState && L.f(this.icon, supportItem.icon) && L.f(this.title, supportItem.title) && L.f(this.subtitle, supportItem.subtitle);
        }

        @l
        public final Drawable getIcon() {
            return this.icon;
        }

        @k
        public final CBRSupportItem getItem() {
            return this.item;
        }

        @k
        public final CBRStepState getStepState() {
            return this.stepState;
        }

        @l
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @l
        public final CharSequence getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = (this.stepState.hashCode() + (this.item.hashCode() * 31)) * 31;
            Drawable drawable = this.icon;
            int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            CharSequence charSequence = this.title;
            int iHashCode3 = (iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.subtitle;
            return iHashCode3 + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SupportItem(item=");
            sb2.append(this.item);
            sb2.append(", stepState=");
            sb2.append(this.stepState);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", title=");
            sb2.append((Object) this.title);
            sb2.append(", subtitle=");
            return c.r(sb2, this.subtitle, ')');
        }
    }

    /* compiled from: CBRSupportViewModel.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$ViewState;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "title", "subtitle", "", "Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$SupportItem;", "supportItems", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;)V", "copy", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;)Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$ViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getSubtitle", "Ljava/util/List;", "getSupportItems", "()Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ViewState implements CBRViewModel.CBRViewModelState {

        @l
        private final CharSequence subtitle;

        @k
        private final List<SupportItem> supportItems;

        @l
        private final CharSequence title;

        public ViewState() {
            this(null, null, null, 7, null);
        }

        @k
        public final ViewState copy(@l CharSequence title, @l CharSequence subtitle, @k List<SupportItem> supportItems) {
            return new ViewState(title, subtitle, supportItems);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return L.f(this.title, viewState.title) && L.f(this.subtitle, viewState.subtitle) && L.f(this.supportItems, viewState.supportItems);
        }

        @l
        public final CharSequence getSubtitle() {
            return this.subtitle;
        }

        @k
        public final List<SupportItem> getSupportItems() {
            return this.supportItems;
        }

        @l
        public final CharSequence getTitle() {
            return this.title;
        }

        public int hashCode() {
            CharSequence charSequence = this.title;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.subtitle;
            return this.supportItems.hashCode() + ((iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(title=");
            sb2.append((Object) this.title);
            sb2.append(", subtitle=");
            sb2.append((Object) this.subtitle);
            sb2.append(", supportItems=");
            return H.p(sb2, this.supportItems, ')');
        }

        public ViewState(@l CharSequence charSequence, @l CharSequence charSequence2, @k List<SupportItem> list) {
            this.title = charSequence;
            this.subtitle = charSequence2;
            this.supportItems = list;
        }

        public ViewState(CharSequence charSequence, CharSequence charSequence2, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: CBRSupportViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel", f = "CBRSupportViewModel.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "onPrepare", n = {"this"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.result = obj;
            this.label |= BeduinInputModel.MIN_TEXT_VERSION;
            return CBRSupportViewModel.this.onPrepare(this);
        }
    }

    /* compiled from: CBRSupportViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModel$ViewState;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$2", f = "CBRSupportViewModel.kt", i = {0, 1}, l = {41, 42}, m = "invokeSuspend", n = {"supportItems", "supportItems"}, s = {"L$0", "L$0"})
    /* renamed from: ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<ViewState, Continuation<? super ViewState>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = CBRSupportViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            List<SupportItem> listC;
            ViewState viewState;
            List<SupportItem> list;
            CharSequence charSequence;
            List<SupportItem> list2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.label;
            if (i12 == 0) {
                C42729a0.b(obj);
                ViewState viewState2 = (ViewState) this.L$0;
                List<CBRSupportItem> supportItems = n0.f432787a.getSupportItems();
                if (supportItems != null) {
                    CBRSupportViewModel cBRSupportViewModel = CBRSupportViewModel.this;
                    ArrayList arrayList = new ArrayList(C42745f0.q(supportItems, 10));
                    for (CBRSupportItem cBRSupportItem : supportItems) {
                        String strIsValid = cBRSupportItem.isValid();
                        SupportItem supportItem = null;
                        if (strIsValid == null || strIsValid.length() == 0) {
                            CBRStepState cBRStepState = CBRStepState.INIT;
                            Drawable iconDrawable = cBRSupportItem.getIconDrawable();
                            String title = cBRSupportItem.getTitle();
                            Spanned spannedA = title != null ? cBRSupportViewModel.extensionProvider.a(title) : null;
                            String subtitle = cBRSupportItem.getSubtitle();
                            supportItem = new SupportItem(cBRSupportItem, cBRStepState, iconDrawable, spannedA, subtitle != null ? cBRSupportViewModel.extensionProvider.a(subtitle) : null);
                        }
                        arrayList.add(supportItem);
                    }
                    listC = C42745f0.C(arrayList);
                } else {
                    listC = C42784z0.f406748b;
                }
                CBRSupportViewModel cBRSupportViewModel2 = CBRSupportViewModel.this;
                this.L$0 = listC;
                this.L$1 = viewState2;
                this.label = 1;
                Object string = cBRSupportViewModel2.getString("sns_support_title", this);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List<SupportItem> list3 = listC;
                viewState = viewState2;
                obj = string;
                list = list3;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    charSequence = (CharSequence) this.L$2;
                    viewState = (ViewState) this.L$1;
                    list2 = (List) this.L$0;
                    C42729a0.b(obj);
                    return viewState.copy(charSequence, (CharSequence) obj, list2);
                }
                viewState = (ViewState) this.L$1;
                list = (List) this.L$0;
                C42729a0.b(obj);
            }
            CharSequence charSequence2 = (CharSequence) obj;
            CBRSupportViewModel cBRSupportViewModel3 = CBRSupportViewModel.this;
            this.L$0 = list;
            this.L$1 = viewState;
            this.L$2 = charSequence2;
            this.label = 2;
            Object string2 = cBRSupportViewModel3.getString("sns_support_subtitle", this);
            if (string2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            charSequence = charSequence2;
            obj = string2;
            list2 = list;
            return viewState.copy(charSequence, (CharSequence) obj, list2);
        }

        @Override // Y41.p
        @l
        public final Object invoke(@k ViewState viewState, @l Continuation<? super ViewState> continuation) {
            return ((AnonymousClass2) create(viewState, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    public CBRSupportViewModel(@k a aVar, @k ru.cyberity.cbr.core.data.source.common.a aVar2, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar) {
        super(aVar2, cVar);
        this.extensionProvider = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onPrepare(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$1 r0 = (ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$1 r0 = new ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel r0 = (ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel) r0
            kotlin.C42729a0.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.C42729a0.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = super.onPrepare(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$2 r5 = new ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel$onPrepare$2
            r1 = 0
            r5.<init>(r1)
            r2 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r0, r2, r5, r3, r1)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.presentation.support.CBRSupportViewModel.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    public ViewState getDefaultState() {
        return new ViewState(null, null, null, 7, null);
    }
}
