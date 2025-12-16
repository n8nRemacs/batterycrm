package ru.cyberity.cbr.presentation.consent;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.view.C23060r0;
import androidx.view.N0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.domain.o;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;

/* compiled from: CBRAgreementSelectorViewModel.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0010\u001d!$B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0010\u0010\u0018J\u0015\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0010\u0010\u001bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R/\u0010(\u001a\u0004\u0018\u00010\u00192\b\u0010#\u001a\u0004\u0018\u00010\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&\"\u0004\b\u0010\u0010'R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b$\u00102¨\u00065"}, d2 = {"Lru/cyberity/cbr/presentation/consent/b;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/presentation/consent/b$d;", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/domain/o;", "sendAgreementUseCase", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "Landroidx/lifecycle/r0;", "savedStateHandle", "<init>", "(Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/domain/o;Lru/cyberity/cbr/core/data/source/extensions/a;Landroidx/lifecycle/r0;)V", "Lru/cyberity/cbr/presentation/consent/b$b;", "a", "()Lru/cyberity/cbr/presentation/consent/b$b;", "Lkotlin/G0;", "e", "()V", "", "type", "Lkotlinx/coroutines/N0;", "(Ljava/lang/String;)Lkotlinx/coroutines/N0;", "", "agreementId", "(I)V", "Lru/cyberity/cbr/core/data/model/b;", "b", "()Lru/cyberity/cbr/core/data/model/b;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "Lru/cyberity/cbr/core/domain/o;", "c", "Lru/cyberity/cbr/core/data/source/extensions/a;", "<set-?>", "d", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "selectedAgreement", "Lkotlinx/coroutines/flow/n2;", "Lkotlinx/coroutines/flow/n2;", "agreementFlow", "Lkotlinx/coroutines/flow/i;", "", "f", "Lkotlinx/coroutines/flow/i;", "agreementsItems", "g", "()Lkotlinx/coroutines/flow/n2;", "viewState", "h", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends CBRViewModel<d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final o sendAgreementUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensionProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.presentation.screen.base.a selectedAgreement;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final n2<Integer> agreementFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC43160i<List<C12502b>> agreementsItems;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final n2<d> viewState;

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434628i = {m0.f406844a.e(new Y(b.class, "selectedAgreement", "getSelectedAgreement()Ljava/lang/Integer;", 0))};

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/presentation/consent/b$b;", "", "", "id", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "country", "<init>", "(ILru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "c", "()Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.consent.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12502b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @k
        private final CBRCountryPicker.CountryItem country;

        public C12502b(int i12, @k CBRCountryPicker.CountryItem countryItem) {
            this.id = i12;
            this.country = countryItem;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final CBRCountryPicker.CountryItem getCountry() {
            return this.country;
        }

        /* renamed from: d, reason: from getter */
        public final int getId() {
            return this.id;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C12502b)) {
                return false;
            }
            C12502b c12502b = (C12502b) other;
            return this.id == c12502b.id && L.f(this.country, c12502b.country);
        }

        public int hashCode() {
            return this.country.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @k
        public String toString() {
            return "CountryWrapperItem(id=" + this.id + ", country=" + this.country + ')';
        }
    }

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/presentation/consent/b$c;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String text;

        public c(@k String str) {
            this.text = str;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && L.f(this.text, ((c) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("ShowAgreementEvent(text="), this.text, ')');
        }
    }

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/cyberity/cbr/presentation/consent/b$d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "selectedAgreementId", "", "titleText", "subtitleText", "acceptText", "footerText", "", "Lru/cyberity/cbr/presentation/consent/b$b;", "countries", "<init>", "(Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "b", "Ljava/lang/CharSequence;", "l", "()Ljava/lang/CharSequence;", "c", "k", "d", "g", "e", "i", "f", "Ljava/util/List;", "h", "()Ljava/util/List;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Integer selectedAgreementId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence titleText;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence subtitleText;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence acceptText;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private final CharSequence footerText;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @k
        private final List<C12502b> countries;

        public d() {
            this(null, null, null, null, null, null, 63, null);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.selectedAgreementId, dVar.selectedAgreementId) && L.f(this.titleText, dVar.titleText) && L.f(this.subtitleText, dVar.subtitleText) && L.f(this.acceptText, dVar.acceptText) && L.f(this.footerText, dVar.footerText) && L.f(this.countries, dVar.countries);
        }

        @l
        /* renamed from: g, reason: from getter */
        public final CharSequence getAcceptText() {
            return this.acceptText;
        }

        @k
        public final List<C12502b> h() {
            return this.countries;
        }

        public int hashCode() {
            Integer num = this.selectedAgreementId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            CharSequence charSequence = this.titleText;
            int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            CharSequence charSequence2 = this.subtitleText;
            int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            CharSequence charSequence3 = this.acceptText;
            int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            CharSequence charSequence4 = this.footerText;
            return this.countries.hashCode() + ((iHashCode4 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31);
        }

        @l
        /* renamed from: i, reason: from getter */
        public final CharSequence getFooterText() {
            return this.footerText;
        }

        @l
        /* renamed from: j, reason: from getter */
        public final Integer getSelectedAgreementId() {
            return this.selectedAgreementId;
        }

        @l
        /* renamed from: k, reason: from getter */
        public final CharSequence getSubtitleText() {
            return this.subtitleText;
        }

        @l
        /* renamed from: l, reason: from getter */
        public final CharSequence getTitleText() {
            return this.titleText;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(selectedAgreementId=");
            sb2.append(this.selectedAgreementId);
            sb2.append(", titleText=");
            sb2.append((Object) this.titleText);
            sb2.append(", subtitleText=");
            sb2.append((Object) this.subtitleText);
            sb2.append(", acceptText=");
            sb2.append((Object) this.acceptText);
            sb2.append(", footerText=");
            sb2.append((Object) this.footerText);
            sb2.append(", countries=");
            return H.p(sb2, this.countries, ')');
        }

        public d(@l Integer num, @l CharSequence charSequence, @l CharSequence charSequence2, @l CharSequence charSequence3, @l CharSequence charSequence4, @k List<C12502b> list) {
            this.selectedAgreementId = num;
            this.titleText = charSequence;
            this.subtitleText = charSequence2;
            this.acceptText = charSequence3;
            this.footerText = charSequence4;
            this.countries = list;
        }

        public d(Integer num, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : charSequence, (i12 & 4) != 0 ? null : charSequence2, (i12 & 8) != 0 ? null : charSequence3, (i12 & 16) == 0 ? charSequence4 : null, (i12 & 32) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lru/cyberity/cbr/presentation/consent/b$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.consent.CBRAgreementSelectorViewModel$agreementsItems$1", f = "CBRAgreementSelectorViewModel.kt", i = {0}, l = {53, 65}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super List<? extends C12502b>>, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434645a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f434646b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k InterfaceC43172j<? super List<C12502b>> interfaceC43172j, @l Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = b.this.new e(continuation);
            eVar.f434646b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object strings;
            ArrayList arrayList;
            String strB;
            String strB2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434645a;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f434646b;
                b bVar = b.this;
                this.f434646b = interfaceC43172j;
                this.f434645a = 1;
                strings = bVar.getStrings(this);
                if (strings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f434646b;
                C42729a0.b(obj);
                strings = obj;
            }
            List<ru.cyberity.cbr.core.data.model.d> listC = ((c.C12476c) strings).c();
            if (listC != null) {
                b bVar2 = b.this;
                arrayList = new ArrayList(C42745f0.q(listC, 10));
                int i13 = 0;
                for (Object obj2 : listC) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ru.cyberity.cbr.core.data.model.d dVar = (ru.cyberity.cbr.core.data.model.d) obj2;
                    ru.cyberity.cbr.core.data.model.c matchCriteria = dVar.getMatchCriteria();
                    String str = "";
                    if (matchCriteria == null || (strB = matchCriteria.getCountry()) == null) {
                        strB = "";
                    }
                    ru.cyberity.cbr.core.data.model.e config = bVar2.getConfig();
                    if (config != null) {
                        ru.cyberity.cbr.core.data.model.b agreement = dVar.getAgreement();
                        strB2 = ru.cyberity.cbr.core.data.model.f.b(config, agreement != null ? agreement.getTitleKey() : null);
                    } else {
                        strB2 = null;
                    }
                    if (strB2 != null) {
                        str = strB2;
                    }
                    arrayList.add(new C12502b(i13, new CBRCountryPicker.CountryItem(strB, str)));
                    i13 = i14;
                }
            } else {
                arrayList = new ArrayList();
            }
            if (listC != null && listC.size() == 1) {
                b.this.a(Boxing.boxInt(0));
            }
            this.f434646b = null;
            this.f434645a = 2;
            if (interfaceC43172j.emit(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.consent.CBRAgreementSelectorViewModel$onAgreeClicked$1", f = "CBRAgreementSelectorViewModel.kt", i = {0, 1}, l = {UpdateStatusCode.DialogButton.CONFIRM, 110, 114}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434648a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f434649b;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f434649b = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.consent.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.consent.CBRAgreementSelectorViewModel$onTermsLinksClicked$1", f = "CBRAgreementSelectorViewModel.kt", i = {1, 2, 3}, l = {127, 128, 137, 138}, m = "invokeSuspend", n = {"html", "agreement", "html"}, s = {"L$0", "L$0", "L$0"})
    public static final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434651a;

        /* renamed from: b, reason: collision with root package name */
        int f434652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f434653c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f434654d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f434653c = str;
            this.f434654d = bVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new g(this.f434653c, this.f434654d, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00d4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.consent.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"", "selectedAgreement", "", "Lru/cyberity/cbr/presentation/consent/b$b;", "agreementsItems", "Lru/cyberity/cbr/presentation/consent/b$d;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.consent.CBRAgreementSelectorViewModel$viewState$1", f = "CBRAgreementSelectorViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 4}, l = {73, 75, 75, 82, 83}, m = "invokeSuspend", n = {"selectedAgreement", "agreementsItems", "selectedAgreement", "agreementsItems", "selectedAgreement", "agreementsItems", "agreementsItems", "agreementsItems"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
    public static final class h extends SuspendLambda implements q<Integer, List<? extends C12502b>, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434655a;

        /* renamed from: b, reason: collision with root package name */
        Object f434656b;

        /* renamed from: c, reason: collision with root package name */
        Object f434657c;

        /* renamed from: d, reason: collision with root package name */
        int f434658d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f434659e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f434660f;

        public h(Continuation<? super h> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l Integer num, @k List<C12502b> list, @l Continuation<? super d> continuation) {
            h hVar = b.this.new h(continuation);
            hVar.f434659e = num;
            hVar.f434660f = list;
            return hVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0112 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.consent.b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRAgreementSelectorViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lru/cyberity/cbr/presentation/consent/b$d;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.consent.CBRAgreementSelectorViewModel$viewState$2", f = "CBRAgreementSelectorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements q<InterfaceC43172j<? super d>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434662a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434663b;

        public i(Continuation<? super i> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k InterfaceC43172j<? super d> interfaceC43172j, @k Throwable th2, @l Continuation<? super G0> continuation) {
            i iVar = b.this.new i(continuation);
            iVar.f434663b = th2;
            return iVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434662a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            Throwable th2 = (Throwable) this.f434663b;
            ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(b.this), "Error building state: " + th2.getMessage(), th2);
            return G0.f406611a;
        }
    }

    public b(@k ru.cyberity.cbr.core.data.source.common.a aVar, @k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @k o oVar, @k ru.cyberity.cbr.core.data.source.extensions.a aVar2, @k C23060r0 c23060r0) {
        super(aVar, cVar);
        this.dataRepository = cVar;
        this.sendAgreementUseCase = oVar;
        this.extensionProvider = aVar2;
        this.selectedAgreement = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "consent_selected_agreement", null);
        n2<Integer> n2VarC = c23060r0.c("consent_selected_agreement", null);
        this.agreementFlow = n2VarC;
        InterfaceC43160i<List<C12502b>> interfaceC43160iG = C43175k.G(new e(null));
        this.agreementsItems = interfaceC43160iG;
        this.viewState = C43175k.U(new C43152f0(new C1(n2VarC, interfaceC43160iG, new h(null)), new i(null)), N0.a(this), i2.a.b(i2.f411430a, 0L, 3), new d(null, null, null, null, null, null, 63, null));
    }

    public final void e() {
        showProgress(true);
        C43259k.d(N0.a(this), null, null, new f(null), 3);
    }

    private final Integer c() {
        return (Integer) this.selectedAgreement.a(this, f434628i[0]);
    }

    @l
    public final ru.cyberity.cbr.core.data.model.b b() {
        ru.cyberity.cbr.core.data.model.d dVar;
        Integer numC = c();
        if (numC == null) {
            return null;
        }
        int iIntValue = numC.intValue();
        List<ru.cyberity.cbr.core.data.model.d> listC = getStrings().c();
        if (listC == null || (dVar = (ru.cyberity.cbr.core.data.model.d) C42745f0.K(iIntValue, listC)) == null) {
            return null;
        }
        return dVar.getAgreement();
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n2<d> getViewState() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Integer num) {
        this.selectedAgreement.a(this, f434628i[0], num);
    }

    @l
    public final C12502b a() {
        Object next;
        Iterator<T> it = getViewState().getValue().h().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int id2 = ((C12502b) next).getId();
            Integer numC = c();
            if (numC != null && id2 == numC.intValue()) {
                break;
            }
        }
        return (C12502b) next;
    }

    @k
    public final kotlinx.coroutines.N0 a(@k String type) {
        return C43259k.d(N0.a(this), null, null, new g(type, this, null), 3);
    }

    public final void a(int agreementId) {
        a(Integer.valueOf(agreementId));
    }
}
