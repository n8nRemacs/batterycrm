package ru.cyberity.cbr.presentation.screen.questionnary.model;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.view.C23060r0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.data.model.p;
import ru.cyberity.cbr.core.data.source.applicant.remote.t;
import ru.cyberity.cbr.core.data.source.applicant.remote.v;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.FieldId;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.ItemValueCache;
import ru.cyberity.cbr.core.presentation.form.model.CountriesData;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.log.LoggerType;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRQuestionnaireViewModel.kt */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0096\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003FD\u001cBe\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u001eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J-\u00105\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\f\u00104\u001a\b\u0012\u0004\u0012\u00020302H\u0016¢\u0006\u0004\b5\u00106J!\u00109\u001a\u00020\u001e2\u0006\u00107\u001a\u00020(2\b\u00108\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b9\u0010-J'\u0010;\u001a\u00020\u001e2\u0006\u00107\u001a\u00020(2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020*\u0018\u000102H\u0016¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u001e¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u001eH\u0002¢\u0006\u0004\bB\u0010>J\u0013\u0010@\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010 J\u0017\u0010D\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020%H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020%H\u0002¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\u001eH\u0002¢\u0006\u0004\bG\u0010>J\u000f\u0010H\u001a\u00020\u001eH\u0002¢\u0006\u0004\bH\u0010>J\u000f\u0010I\u001a\u00020\u001eH\u0002¢\u0006\u0004\bI\u0010>J\u0017\u0010F\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bF\u0010LJ\u0017\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u000102H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010@\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020%H\u0002¢\u0006\u0004\b@\u0010EJ\u0017\u0010@\u001a\u00020\u001e2\u0006\u0010Q\u001a\u00020MH\u0002¢\u0006\u0004\b@\u0010RJ'\u0010@\u001a\u00020\u001e2\u0006\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020*2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b@\u0010UJ%\u0010@\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020(2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020*02H\u0002¢\u0006\u0004\b@\u0010<J\u001f\u0010@\u001a\u00020\u001e2\u0006\u00101\u001a\u0002002\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\b@\u0010XJ!\u0010@\u001a\u00020M*\u00020M2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020002H\u0002¢\u0006\u0004\b@\u0010ZJ'\u0010@\u001a\u00020\u001e2\u0006\u0010V\u001a\u0002002\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[02H\u0002¢\u0006\u0004\b@\u0010]J\u0019\u0010@\u001a\u0004\u0018\u00010(2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b@\u0010^J9\u0010@\u001a\b\u0012\u0004\u0012\u00020`022\u0006\u0010/\u001a\u00020.2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\b\u0010_\u001a\u0004\u0018\u00010*H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010aJ#\u0010@\u001a\u00020\u001e2\u0006\u0010b\u001a\u00020*2\n\u0010e\u001a\u00060cj\u0002`dH\u0002¢\u0006\u0004\b@\u0010fJ\u0017\u0010@\u001a\u00020\u001e2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\b@\u0010iR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010jR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010kR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010lR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010mR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010nR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR/\u0010y\u001a\u0004\u0018\u00010\u00142\b\u0010t\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\be\u0010w\"\u0004\b@\u0010xR/\u0010|\u001a\u0004\u0018\u00010\u00162\b\u0010t\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010v\u001a\u0004\bo\u0010z\"\u0004\b@\u0010{R/\u0010\u007f\u001a\u0004\u0018\u00010\u00182\b\u0010t\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010v\u001a\u0004\bF\u0010}\"\u0004\b@\u0010~R-\u0010\u0081\u0001\u001a\u00020J2\u0006\u0010t\u001a\u00020J8B@BX\u0082\u008e\u0002¢\u0006\u0013\n\u0004\bB\u0010v\u001a\u0005\bD\u0010\u0080\u0001\"\u0004\b@\u0010LR8\u0010Y\u001a\b\u0012\u0004\u0012\u000200022\f\u0010t\u001a\b\u0012\u0004\u0012\u000200028B@BX\u0082\u008e\u0002¢\u0006\u0013\n\u0004\b=\u0010v\u001a\u0004\bq\u0010O\"\u0005\b@\u0010\u0082\u0001R\u001e\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010\u0085\u0001R\u001f\u0010\u008b\u0001\u001a\u00030\u0087\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bG\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u008f\u0001\u001a\u0010\u0012\u0004\u0012\u000200\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010\u008e\u0001R\u001f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0090\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0095\u0001\u001a\u00020g8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bu\u0010\u0094\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0097\u0001"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel;", "Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/domain/g;", "questionnaireUseCase", "Lru/cyberity/cbr/domain/i;", "submitQuestionnaireUseCase", "Lru/cyberity/cbr/domain/m;", "uploadDocumentImagesUseCase", "Lru/cyberity/cbr/domain/d;", "deleteDocumentImagesUseCase", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "questionnaireResponseInit", "Lru/cyberity/cbr/core/data/source/applicant/remote/v;", "questionnaireSubmitModelInit", "Lru/cyberity/cbr/core/presentation/form/model/CountriesData;", "countriesDataInit", "<init>", "(Landroidx/lifecycle/r0;Lru/cyberity/cbr/domain/g;Lru/cyberity/cbr/domain/i;Lru/cyberity/cbr/domain/m;Lru/cyberity/cbr/domain/d;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/domain/b;Lru/cyberity/cbr/core/data/source/applicant/remote/t;Lru/cyberity/cbr/core/data/source/applicant/remote/v;Lru/cyberity/cbr/core/presentation/form/model/CountriesData;)V", "d", "()Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/p;", "error", "onErrorCancelled", "(Lru/cyberity/cbr/core/data/model/p;)V", "", "i", "()Z", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "item", "", "fileId", "onDeleteFile", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "fieldId", "", "Landroid/net/Uri;", "uris", "onPickedFiles", "(Landroid/content/Context;Lru/cyberity/cbr/core/presentation/form/FieldId;Ljava/util/List;)V", "field", "value", "onFieldValueChanged", "values", "onFieldValuesChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/util/List;)V", "l", "()V", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;", "a", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;", "k", "andContinue", "c", "(Z)V", "b", "n", "o", "m", "", "index", "(I)V", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "j", "()Ljava/util/List;", "isForward", "page", "(Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;)V", "Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;", "itemState", "(Lru/cyberity/cbr/core/presentation/form/FieldId;Ljava/lang/String;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;)V", "aItem", "imageIds", "(Lru/cyberity/cbr/core/presentation/form/FieldId;Lru/cyberity/cbr/core/presentation/form/model/FormItem$ItemState;)V", "uploadingFields", "(Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;Ljava/util/List;)Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "Lru/cyberity/cbr/core/data/model/remote/k;", "remoteIdDocs", "(Lru/cyberity/cbr/core/presentation/form/FieldId;Ljava/util/List;)V", "(Lru/cyberity/cbr/core/presentation/form/FieldId;)Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "currentCountryKey", "Lru/cyberity/cbr/core/data/model/o;", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "currentQuestionnaire", "(Lru/cyberity/cbr/core/data/source/applicant/remote/r;)V", "Lru/cyberity/cbr/domain/g;", "Lru/cyberity/cbr/domain/i;", "Lru/cyberity/cbr/domain/m;", "Lru/cyberity/cbr/domain/d;", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "f", "Lru/cyberity/cbr/core/domain/b;", "g", "Ljava/lang/String;", "idDocSetType", "<set-?>", "h", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "()Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "(Lru/cyberity/cbr/core/data/source/applicant/remote/t;)V", "questionnaireResponseDelegate", "()Lru/cyberity/cbr/core/data/source/applicant/remote/v;", "(Lru/cyberity/cbr/core/data/source/applicant/remote/v;)V", "submitModelDelegate", "()Lru/cyberity/cbr/core/presentation/form/model/CountriesData;", "(Lru/cyberity/cbr/core/presentation/form/model/CountriesData;)V", "countriesDataDelegate", "()I", "currentPageIndex", "(Ljava/util/List;)V", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", "Lkotlinx/coroutines/flow/Z1;", "_formViewState", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "getItemValueCache", "()Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "itemValueCache", "", "Lkotlinx/coroutines/N0;", "Ljava/util/Map;", "jobMap", "Lkotlinx/coroutines/flow/n2;", "getFormViewState", "()Lkotlinx/coroutines/flow/n2;", "formViewState", "()Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "_currentQuestionnaire", "p", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends CBRViewModel<d> implements HostViewModel {

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f435396q;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.domain.g questionnaireUseCase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.domain.i submitQuestionnaireUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.domain.m uploadDocumentImagesUseCase;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.domain.d deleteDocumentImagesUseCase;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.dynamic.c dataRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.domain.b countriesUseCase;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String idDocSetType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a questionnaireResponseDelegate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a submitModelDelegate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a countriesDataDelegate;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a currentPageIndex;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a uploadingFields;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<HostViewModel.FormViewState> _formViewState;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ItemValueCache itemValueCache;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Map<FieldId, N0> jobMap;

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$1", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.presentation.screen.questionnary.model.a$a, reason: collision with other inner class name */
    public static final class C12536a extends SuspendLambda implements Y41.p<d, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435412a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435413b;

        public C12536a(Continuation<? super C12536a> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super G0> continuation) {
            return ((C12536a) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C12536a c12536a = a.this.new C12536a(continuation);
            c12536a.f435413b = obj;
            return c12536a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435412a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d dVar = (d) this.f435413b;
            a.this._formViewState.setValue(new HostViewModel.FormViewState(dVar.getCurrentPageIndex(), dVar.h(), dVar.getMimeTypes(), a.this.a()));
            return G0.f406611a;
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0004R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "index", "b", "Ljava/lang/String;", "h", "title", "c", "g", "subtitle", "", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "items", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String title;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String subtitle;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<FormItem> items;

        /* renamed from: e, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.index == cVar.index && L.f(this.title, cVar.title) && L.f(this.subtitle, cVar.subtitle) && L.f(this.items, cVar.items);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.index) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            return this.items.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Page(index=");
            sb2.append(this.index);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", items=");
            return H.p(sb2, this.items, ')');
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelState;", "", "mimeTypes", "", "currentPageIndex", "Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d$a;", "buttonContinue", "", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "pages", "<init>", "(Ljava/lang/String;ILru/cyberity/cbr/presentation/screen/questionnary/model/a$d$a;Ljava/util/List;)V", "a", "(Ljava/lang/String;ILru/cyberity/cbr/presentation/screen/questionnary/model/a$d$a;Ljava/util/List;)Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "I", "f", "c", "Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d$a;", "e", "()Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d$a;", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d implements CBRViewModel.CBRViewModelState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String mimeTypes;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int currentPageIndex;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final C12537a buttonContinue;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final List<HostViewModel.Page> pages;

        public d() {
            this(null, 0, null, null, 15, null);
        }

        @Y61.k
        public final d a(@Y61.l String mimeTypes, int currentPageIndex, @Y61.l C12537a buttonContinue, @Y61.k List<HostViewModel.Page> pages) {
            return new d(mimeTypes, currentPageIndex, buttonContinue, pages);
        }

        @Y61.l
        /* renamed from: e, reason: from getter */
        public final C12537a getButtonContinue() {
            return this.buttonContinue;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.mimeTypes, dVar.mimeTypes) && this.currentPageIndex == dVar.currentPageIndex && L.f(this.buttonContinue, dVar.buttonContinue) && L.f(this.pages, dVar.pages);
        }

        /* renamed from: f, reason: from getter */
        public final int getCurrentPageIndex() {
            return this.currentPageIndex;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final String getMimeTypes() {
            return this.mimeTypes;
        }

        @Y61.k
        public final List<HostViewModel.Page> h() {
            return this.pages;
        }

        public int hashCode() {
            String str = this.mimeTypes;
            int iE2 = androidx.appcompat.app.r.e(this.currentPageIndex, (str == null ? 0 : str.hashCode()) * 31, 31);
            C12537a c12537a = this.buttonContinue;
            return this.pages.hashCode() + ((iE2 + (c12537a != null ? c12537a.hashCode() : 0)) * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(mimeTypes=");
            sb2.append(this.mimeTypes);
            sb2.append(", currentPageIndex=");
            sb2.append(this.currentPageIndex);
            sb2.append(", buttonContinue=");
            sb2.append(this.buttonContinue);
            sb2.append(", pages=");
            return H.p(sb2, this.pages, ')');
        }

        public d(@Y61.l String str, int i12, @Y61.l C12537a c12537a, @Y61.k List<HostViewModel.Page> list) {
            this.mimeTypes = str;
            this.currentPageIndex = i12;
            this.buttonContinue = c12537a;
            this.pages = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d a(d dVar, String str, int i12, C12537a c12537a, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = dVar.mimeTypes;
            }
            if ((i13 & 2) != 0) {
                i12 = dVar.currentPageIndex;
            }
            if ((i13 & 4) != 0) {
                c12537a = dVar.buttonContinue;
            }
            if ((i13 & 8) != 0) {
                list = dVar.pages;
            }
            return dVar.a(str, i12, c12537a, list);
        }

        /* compiled from: CBRQuestionnaireViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d$a;", "", "", "enabled", "", "text", "<init>", "(ZLjava/lang/CharSequence;)V", "a", "(ZLjava/lang/CharSequence;)Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.questionnary.model.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C12537a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final boolean enabled;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence text;

            public C12537a(boolean z12, @Y61.l CharSequence charSequence) {
                this.enabled = z12;
                this.text = charSequence;
            }

            @Y61.k
            public final C12537a a(boolean enabled, @Y61.l CharSequence text) {
                return new C12537a(enabled, text);
            }

            /* renamed from: c, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            @Y61.l
            /* renamed from: d, reason: from getter */
            public final CharSequence getText() {
                return this.text;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12537a)) {
                    return false;
                }
                C12537a c12537a = (C12537a) other;
                return this.enabled == c12537a.enabled && L.f(this.text, c12537a.text);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            public int hashCode() {
                boolean z12 = this.enabled;
                ?? r02 = z12;
                if (z12) {
                    r02 = 1;
                }
                int i12 = r02 * 31;
                CharSequence charSequence = this.text;
                return i12 + (charSequence == null ? 0 : charSequence.hashCode());
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Button(enabled=");
                sb2.append(this.enabled);
                sb2.append(", text=");
                return AK.c.r(sb2, this.text, ')');
            }

            public /* synthetic */ C12537a(boolean z12, CharSequence charSequence, int i12, C42822w c42822w) {
                this(z12, (i12 & 2) != 0 ? null : charSequence);
            }
        }

        public d(String str, int i12, C12537a c12537a, List list, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : c12537a, (i13 & 8) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel", f = "CBRQuestionnaireViewModel.kt", i = {0, 0, 0}, l = {761}, m = "getPickResults", n = {"context", "currentCountryKey", "destination$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435425a;

        /* renamed from: b, reason: collision with root package name */
        Object f435426b;

        /* renamed from: c, reason: collision with root package name */
        Object f435427c;

        /* renamed from: d, reason: collision with root package name */
        Object f435428d;

        /* renamed from: e, reason: collision with root package name */
        Object f435429e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f435430f;

        /* renamed from: h, reason: collision with root package name */
        int f435432h;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435430f = obj;
            this.f435432h |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.a((Context) null, (List<? extends Uri>) null, (String) null, this);
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"ru/cyberity/cbr/presentation/screen/questionnary/model/a$f", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "", "sectionId", "itemId", "valueFor", "", "valuesFor", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements ItemValueCache {
        public f() {
        }

        @Override // ru.cyberity.cbr.core.presentation.form.ItemValueCache
        @Y61.l
        public String valueFor(@Y61.k String sectionId, @Y61.k String itemId) {
            return ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(a.this.h(), sectionId, itemId);
        }

        @Override // ru.cyberity.cbr.core.presentation.form.ItemValueCache
        @Y61.l
        public List<String> valuesFor(@Y61.k String sectionId, @Y61.k String itemId) {
            return ru.cyberity.cbr.presentation.screen.questionnary.model.f.b(a.this.h(), sectionId, itemId);
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel", f = "CBRQuestionnaireViewModel.kt", i = {0, 1, 1}, l = {254, 263}, m = "loadCountryData", n = {"this", "this", "countriesResult"}, s = {"L$0", "L$0", "L$1"})
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435434a;

        /* renamed from: b, reason: collision with root package name */
        Object f435435b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f435436c;

        /* renamed from: e, reason: collision with root package name */
        int f435438e;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435436c = obj;
            this.f435438e |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.a(this);
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$loadQuestionnaire$1", f = "CBRQuestionnaireViewModel.kt", i = {0, 1, 2, 2, 3, 3}, l = {204, JfifUtil.MARKER_RST0, JfifUtil.MARKER_RST7, 223}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch", "result", "result", "countriesResult"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435439a;

        /* renamed from: b, reason: collision with root package name */
        int f435440b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f435441c;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = a.this.new h(continuation);
            hVar.f435441c = obj;
            return hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 381
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    public static final class i extends N implements Y41.l<Throwable, G0> {
        public i() {
            super(1);
        }

        public final void a(@Y61.l Throwable th2) {
            a.this.showProgress(false);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(Throwable th2) {
            a(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$onDeleteFile$1", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {466}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435444a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FormItem f435446c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f435447d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(FormItem formItem, String str, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f435446c = formItem;
            this.f435447d = str;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new j(this.f435446c, this.f435447d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws NumberFormatException {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435444a;
            if (i12 == 0) {
                C42729a0.b(obj);
                a.this.a(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(this.f435446c), this.f435447d, FormItem.ItemState.LOADING);
                ru.cyberity.cbr.domain.d dVar = a.this.deleteDocumentImagesUseCase;
                List<String> listSingletonList = Collections.singletonList(this.f435447d);
                this.f435444a = 1;
                objA = dVar.a(listSingletonList, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objA = ((Z) obj).f406625b;
            }
            int i13 = Z.f406624c;
            boolean z12 = objA instanceof Z.b;
            if (z12) {
                a.this.a(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(this.f435446c), this.f435447d, FormItem.ItemState.DEFAULT);
                a.this.a("Send file error", (Exception) Z.b(objA));
                return G0.f406611a;
            }
            a.this.a(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(this.f435446c), this.f435447d, FormItem.ItemState.DEFAULT);
            if (z12) {
                objA = null;
            }
            List list = (List) objA;
            if (list != null) {
                a.this.a(this.f435446c, (List<String>) list);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$onPickedFiles$1", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {590, 603, 599}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435448a;

        /* renamed from: b, reason: collision with root package name */
        Object f435449b;

        /* renamed from: c, reason: collision with root package name */
        Object f435450c;

        /* renamed from: d, reason: collision with root package name */
        int f435451d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ FieldId f435453f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f435454g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Uri> f435455h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(FieldId fieldId, Context context, List<? extends Uri> list, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f435453f = fieldId;
            this.f435454g = context;
            this.f435455h = list;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new k(this.f435453f, this.f435454g, this.f435455h, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 7, 1})
    public static final class l extends N implements Y41.l<Throwable, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FieldId f435456a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f435457b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(FieldId fieldId, a aVar) {
            super(1);
            this.f435456a = fieldId;
            this.f435457b = aVar;
        }

        public final void a(@Y61.l Throwable th2) {
            Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "stopped job for " + this.f435456a, null, 4, null);
            this.f435457b.jobMap.remove(this.f435456a);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(Throwable th2) {
            a(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel", f = "CBRQuestionnaireViewModel.kt", i = {0}, l = {157}, m = "onPrepare", n = {"this"}, s = {"L$0"})
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f435458a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435459b;

        /* renamed from: d, reason: collision with root package name */
        int f435461d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f435459b = obj;
            this.f435461d |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.onPrepare(this);
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$onPrepare$2", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {160, 163}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Y41.p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435462a;

        /* renamed from: b, reason: collision with root package name */
        int f435463b;

        /* renamed from: c, reason: collision with root package name */
        int f435464c;

        /* renamed from: d, reason: collision with root package name */
        int f435465d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f435466e;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((n) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            n nVar = a.this.new n(continuation);
            nVar.f435466e = obj;
            return nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f435465d
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L29
                if (r1 != r3) goto L21
                int r0 = r12.f435464c
                int r1 = r12.f435463b
                java.lang.Object r3 = r12.f435462a
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r5 = r12.f435466e
                ru.cyberity.cbr.presentation.screen.questionnary.model.a$d r5 = (ru.cyberity.cbr.presentation.screen.questionnary.model.a.d) r5
                kotlin.C42729a0.b(r13)
                r7 = r1
                r6 = r3
                goto L73
            L21:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L29:
                java.lang.Object r1 = r12.f435466e
                ru.cyberity.cbr.presentation.screen.questionnary.model.a$d r1 = (ru.cyberity.cbr.presentation.screen.questionnary.model.a.d) r1
                kotlin.C42729a0.b(r13)
                r5 = r1
                goto L4a
            L32:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f435466e
                ru.cyberity.cbr.presentation.screen.questionnary.model.a$d r13 = (ru.cyberity.cbr.presentation.screen.questionnary.model.a.d) r13
                ru.cyberity.cbr.presentation.screen.questionnary.model.a r1 = ru.cyberity.cbr.presentation.screen.questionnary.model.a.this
                r12.f435466e = r13
                r12.f435465d = r4
                java.lang.String r5 = "sns_questionnaire_mime_types"
                java.lang.Object r1 = ru.cyberity.cbr.presentation.screen.questionnary.model.a.a(r1, r5, r12)
                if (r1 != r0) goto L48
                return r0
            L48:
                r5 = r13
                r13 = r1
            L4a:
                r1 = r13
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L57
                boolean r1 = kotlin.text.C43066x.K(r1)
                r1 = r1 ^ r4
                if (r1 != r4) goto L57
                goto L58
            L57:
                r13 = 0
            L58:
                java.lang.String r13 = (java.lang.String) r13
                ru.cyberity.cbr.presentation.screen.questionnary.model.a r1 = ru.cyberity.cbr.presentation.screen.questionnary.model.a.this
                r12.f435466e = r5
                r12.f435462a = r13
                r12.f435463b = r2
                r12.f435464c = r4
                r12.f435465d = r3
                java.lang.String r3 = "sns_quiestionnaire_action_continue"
                java.lang.Object r1 = ru.cyberity.cbr.presentation.screen.questionnary.model.a.a(r1, r3, r12)
                if (r1 != r0) goto L6f
                return r0
            L6f:
                r6 = r13
                r13 = r1
                r7 = r2
                r0 = r4
            L73:
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                ru.cyberity.cbr.presentation.screen.questionnary.model.a$d$a r8 = new ru.cyberity.cbr.presentation.screen.questionnary.model.a$d$a
                if (r0 == 0) goto L7a
                r2 = r4
            L7a:
                r8.<init>(r2, r13)
                r10 = 10
                r11 = 0
                r9 = 0
                ru.cyberity.cbr.presentation.screen.questionnary.model.a$d r13 = ru.cyberity.cbr.presentation.screen.questionnary.model.a.d.a(r5, r6, r7, r8, r9, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$sendLog$1", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435468a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f435469b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f435470c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Exception f435471d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Exception exc, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f435470c = str;
            this.f435471d = exc;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            o oVar = new o(this.f435470c, this.f435471d, continuation);
            oVar.f435469b = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435468a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            ru.cyberity.log.a.f436064a.a(LoggerType.KIBANA).e(ru.cyberity.log.c.a((T) this.f435469b), this.f435470c, this.f435471d);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "viewState", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$showPageWithIndex$2", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Y41.p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435472a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435473b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<HostViewModel.Page> f435475d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f435476e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(List<HostViewModel.Page> list, boolean z12, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f435475d = list;
            this.f435476e = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((p) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            p pVar = a.this.new p(this.f435475d, this.f435476e, continuation);
            pVar.f435473b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435472a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d dVar = (d) this.f435473b;
            int iC2 = a.this.c();
            d.C12537a buttonContinue = dVar.getButtonContinue();
            return d.a(dVar, null, iC2, buttonContinue != null ? buttonContinue.a(this.f435476e, buttonContinue.getText()) : null, this.f435475d, 1, null);
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$submitForm$1", f = "CBRQuestionnaireViewModel.kt", i = {0}, l = {287}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435477a;

        /* renamed from: b, reason: collision with root package name */
        boolean f435478b;

        /* renamed from: c, reason: collision with root package name */
        int f435479c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f435480d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f435482f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f435483g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, boolean z12, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f435482f = str;
            this.f435483g = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            q qVar = a.this.new q(this.f435482f, this.f435483g, continuation);
            qVar.f435480d = obj;
            return qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:6:0x0016, B:33:0x0084, B:35:0x008a, B:37:0x0090, B:39:0x009f, B:40:0x00b1, B:42:0x00b4, B:46:0x00ba, B:48:0x00be), top: B:56:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:6:0x0016, B:33:0x0084, B:35:0x008a, B:37:0x0090, B:39:0x009f, B:40:0x00b1, B:42:0x00b4, B:46:0x00ba, B:48:0x00be), top: B:56:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "viewState", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$updateFileAttachmentFieldItemStateWithId$1", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Y41.p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435484a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435485b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<HostViewModel.Page> f435486c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f435487d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<HostViewModel.Page> list, boolean z12, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f435486c = list;
            this.f435487d = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((r) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            r rVar = new r(this.f435486c, this.f435487d, continuation);
            rVar.f435485b = obj;
            return rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435484a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d dVar = (d) this.f435485b;
            d.C12537a buttonContinue = dVar.getButtonContinue();
            return d.a(dVar, null, 0, buttonContinue != null ? buttonContinue.a(this.f435487d, buttonContinue.getText()) : null, this.f435486c, 3, null);
        }
    }

    /* compiled from: CBRQuestionnaireViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "viewState", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.questionnary.model.CBRQuestionnaireViewModel$updateFileAttachmentFieldStateWithId$1", f = "CBRQuestionnaireViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Y41.p<d, Continuation<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435488a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f435489b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<HostViewModel.Page> f435490c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f435491d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List<HostViewModel.Page> list, boolean z12, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f435490c = list;
            this.f435491d = z12;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k d dVar, @Y61.l Continuation<? super d> continuation) {
            return ((s) create(dVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            s sVar = new s(this.f435490c, this.f435491d, continuation);
            sVar.f435489b = obj;
            return sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435488a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            d dVar = (d) this.f435489b;
            d.C12537a buttonContinue = dVar.getButtonContinue();
            return d.a(dVar, null, 0, buttonContinue != null ? buttonContinue.a(this.f435491d, buttonContinue.getText()) : null, this.f435490c, 3, null);
        }
    }

    static {
        Y y12 = new Y(a.class, "questionnaireResponseDelegate", "getQuestionnaireResponseDelegate()Lru/cyberity/cbr/core/data/source/applicant/remote/QuestionnaireResponse;", 0);
        n0 n0Var = m0.f406844a;
        f435396q = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(a.class, "submitModelDelegate", "getSubmitModelDelegate()Lru/cyberity/cbr/core/data/source/applicant/remote/QuestionnaireSubmitModel;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "countriesDataDelegate", "getCountriesDataDelegate()Lru/cyberity/cbr/core/presentation/form/model/CountriesData;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "currentPageIndex", "getCurrentPageIndex()I", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(a.class, "uploadingFields", "getUploadingFields()Ljava/util/List;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    public a(@Y61.k C23060r0 c23060r0, @Y61.k ru.cyberity.cbr.domain.g gVar, @Y61.k ru.cyberity.cbr.domain.i iVar, @Y61.k ru.cyberity.cbr.domain.m mVar, @Y61.k ru.cyberity.cbr.domain.d dVar, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.cbr.core.domain.b bVar, @Y61.l t tVar, @Y61.l v vVar, @Y61.l CountriesData countriesData) {
        super(aVar, cVar);
        this.questionnaireUseCase = gVar;
        this.submitQuestionnaireUseCase = iVar;
        this.uploadDocumentImagesUseCase = mVar;
        this.deleteDocumentImagesUseCase = dVar;
        this.dataRepository = cVar;
        this.countriesUseCase = bVar;
        String str = (String) c23060r0.b("IDDOCSETTYPE");
        this.idDocSetType = str == null ? "TYPE_UNKNOWN" : str;
        this.questionnaireResponseDelegate = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_QUESTIONNAIRE_RESPONSE", tVar);
        this.submitModelDelegate = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_QUESTIONNAIRE_SUBMIT_MODEL", vVar);
        this.countriesDataDelegate = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_COUNTRIES_DATA_MODEL", countriesData);
        this.currentPageIndex = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_CURRENT_PAGE_NUMBER", 0);
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.uploadingFields = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_UPLOADED_FIELDS", c42784z0);
        this._formViewState = p2.a(new HostViewModel.FormViewState(0, c42784z0, null, new HostViewModel.ValidationStrings(null, null, 3, null)));
        j0.b(getViewState(), androidx.view.N0.a(this), new C12536a(null));
        this.itemValueCache = new f();
        this.jobMap = new LinkedHashMap();
    }

    private final void o() {
        a(c() - 1);
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "showPreviousPage: " + c(), null, 4, null);
        b(c());
        a(false);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    @Y61.k
    public n2<HostViewModel.FormViewState> getFormViewState() {
        return this._formViewState;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    @Y61.k
    public ItemValueCache getItemValueCache() {
        return this.itemValueCache;
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    public void onDeleteFile(@Y61.k FormItem item, @Y61.k String fileId) {
        C43259k.d(androidx.view.N0.a(this), null, null, new j(item, fileId, null), 3);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    public void onErrorCancelled(@Y61.k ru.cyberity.cbr.core.data.model.p error) {
        if (error instanceof p.b) {
            CBRViewModel.finish$default(this, null, null, null, 7, null);
        } else {
            super.onErrorCancelled(error);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    public void onFieldValueChanged(@Y61.k FormItem field, @Y61.l String value) {
        a(ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(h(), field.getSectionId(), field.getItem().getId(), value));
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    public void onFieldValuesChanged(@Y61.k FormItem field, @Y61.l List<String> values) {
        a(ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(h(), field.getSectionId(), field.getItem().getId(), values));
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    public void onPickedFiles(@Y61.k Context context, @Y61.k FieldId fieldId, @Y61.k List<? extends Uri> uris) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "onPickedFiles: $" + fieldId, null, 4, null);
        a(fieldId, FormItem.ItemState.LOADING);
        N0 n0D = C43259k.d(androidx.view.N0.a(this), null, null, new k(fieldId, context, uris, null), 3);
        this.jobMap.put(fieldId, n0D);
        ((V0) n0D).k(new l(fieldId, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onPrepare(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ru.cyberity.cbr.presentation.screen.questionnary.model.a.m
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.cbr.presentation.screen.questionnary.model.a$m r0 = (ru.cyberity.cbr.presentation.screen.questionnary.model.a.m) r0
            int r1 = r0.f435461d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f435461d = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.questionnary.model.a$m r0 = new ru.cyberity.cbr.presentation.screen.questionnary.model.a$m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f435459b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f435461d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f435458a
            ru.cyberity.cbr.presentation.screen.questionnary.model.a r0 = (ru.cyberity.cbr.presentation.screen.questionnary.model.a) r0
            kotlin.C42729a0.b(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.C42729a0.b(r6)
            r0.f435458a = r5
            r0.f435461d = r3
            java.lang.Object r6 = super.onPrepare(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r0 = r5
        L44:
            ru.cyberity.cbr.presentation.screen.questionnary.model.a$n r6 = new ru.cyberity.cbr.presentation.screen.questionnary.model.a$n
            r1 = 0
            r6.<init>(r1)
            r2 = 0
            ru.cyberity.cbr.core.presentation.base.CBRViewModel.updateState$default(r0, r2, r6, r3, r1)
            ru.cyberity.cbr.core.data.source.applicant.remote.t r6 = r0.e()
            if (r6 != 0) goto L58
            r0.k()
            goto L88
        L58:
            java.util.List r6 = r0.g()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r6.next()
            r3 = r2
            ru.cyberity.cbr.core.presentation.form.FieldId r3 = (ru.cyberity.cbr.core.presentation.form.FieldId) r3
            java.util.Map<ru.cyberity.cbr.core.presentation.form.FieldId, kotlinx.coroutines.N0> r4 = r0.jobMap
            boolean r3 = r4.containsKey(r3)
            if (r3 == 0) goto L65
            r1.add(r2)
            goto L65
        L7e:
            r0.a(r1)
            int r6 = r0.c()
            r0.b(r6)
        L88:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.onPrepare(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c() {
        return ((Number) this.currentPageIndex.a(this, f435396q[3])).intValue();
    }

    private final t e() {
        return (t) this.questionnaireResponseDelegate.a(this, f435396q[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v f() {
        return (v) this.submitModelDelegate.a(this, f435396q[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FieldId> g() {
        return (List) this.uploadingFields.a(this, f435396q[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.core.data.source.applicant.remote.r h() {
        List<ru.cyberity.cbr.core.data.source.applicant.remote.r> listE;
        Object next;
        t tVarE = e();
        String id2 = tVarE != null ? tVarE.getId() : null;
        v vVarF = f();
        if (vVarF != null && (listE = vVarF.e()) != null) {
            Iterator<T> it = listE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((ru.cyberity.cbr.core.data.source.applicant.remote.r) next).getId(), id2)) {
                    break;
                }
            }
            ru.cyberity.cbr.core.data.source.applicant.remote.r rVar = (ru.cyberity.cbr.core.data.source.applicant.remote.r) next;
            if (rVar != null) {
                return rVar;
            }
        }
        return new ru.cyberity.cbr.core.data.source.applicant.remote.r(id2, (Map) null, 2, (C42822w) null);
    }

    private final List<HostViewModel.Page> j() {
        t tVarE;
        CountriesData countriesDataB = b();
        if (countriesDataB == null || (tVarE = e()) == null) {
            return null;
        }
        return ru.cyberity.cbr.presentation.screen.questionnary.model.e.a(tVarE, countriesDataB, f(), getStrings().d());
    }

    private final void k() {
        showProgress(true);
        ((V0) C43259k.d(androidx.view.N0.a(this), null, null, new h(null), 3)).k(new i());
    }

    private final void m() {
        b(c());
    }

    private final void n() {
        a(c() + 1);
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "showNextPage: " + c(), null, 4, null);
        b(c());
        a(true);
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d getDefaultState() {
        return new d(null, 0, null, null, 15, null);
    }

    public final boolean i() {
        if (c() == 0) {
            return false;
        }
        if (c() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        o();
        return true;
    }

    public final void l() {
        showProgress(true);
        c(true);
        showProgress(false);
    }

    private final CountriesData b() {
        return (CountriesData) this.countriesDataDelegate.a(this, f435396q[2]);
    }

    private final void c(boolean andContinue) {
        t tVarE;
        String id2;
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", com.avito.android.bxcontent.mvi.entity.f.l("submitForm: andContinue=", andContinue), null, 4, null);
        if (f() == null || (tVarE = e()) == null || (id2 = tVarE.getId()) == null) {
            return;
        }
        C43259k.d(androidx.view.N0.a(this), null, null, new q(id2, andContinue, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean andContinue) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", com.avito.android.bxcontent.mvi.entity.f.l("handleSubmitSuccess: andContinue=", andContinue), null, 4, null);
        if (andContinue) {
            d dVarCurrentState = currentState();
            if (dVarCurrentState.getCurrentPageIndex() < C42745f0.J(dVarCurrentState.h())) {
                n();
            } else {
                CBRViewModel.finish$default(this, new a0.b(true), null, null, 6, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(t tVar) {
        this.questionnaireResponseDelegate.a(this, f435396q[0], tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(int index) {
        Logger.i$default(ru.cyberity.log.a.f436064a, "Questionnaire", AK.c.g(index, "Show page with index "), null, 4, null);
        a(index);
        List<HostViewModel.Page> listJ = j();
        if (listJ != null) {
            ArrayList arrayList = new ArrayList(C42745f0.q(listJ, 10));
            for (HostViewModel.Page pageA : listJ) {
                if (pageA.getIndex() == c()) {
                    pageA = a(pageA, g());
                }
                arrayList.add(pageA);
            }
            Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "pages total " + arrayList.size(), null, 4, null);
            if (arrayList.size() <= c()) {
                CBRViewModel.throwError$default(this, new IllegalStateException("Empty questionnaire"), this.idDocSetType, null, 4, null);
                return;
            }
            HostViewModel.Page page = (HostViewModel.Page) C42745f0.K(c(), arrayList);
            if (page != null) {
                a(page);
            }
            CBRViewModel.updateState$default(this, false, new p(arrayList, ru.cyberity.cbr.presentation.screen.questionnary.model.c.b((HostViewModel.Page) arrayList.get(c())), null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(v vVar) {
        this.submitModelDelegate.a(this, f435396q[1], vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(CountriesData countriesData) {
        this.countriesDataDelegate.a(this, f435396q[2], countriesData);
    }

    private final void a(int i12) {
        this.currentPageIndex.a(this, f435396q[3], Integer.valueOf(i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List<FieldId> list) {
        this.uploadingFields.a(this, f435396q[4], list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HostViewModel.ValidationStrings a() {
        return new HostViewModel.ValidationStrings(getStrings().a("sns_quiestionnaire_field_isRequired"), getStrings().a("sns_quiestionnaire_field_isNotValid"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.a(boolean):void");
    }

    private final void a(HostViewModel.Page page) {
        ru.cyberity.cbr.core.data.source.applicant.remote.r rVarH = h();
        ru.cyberity.cbr.core.data.source.applicant.remote.r rVarA = null;
        for (FormItem formItem : page.getItems()) {
            if (formItem instanceof FormItem.Section) {
                rVarA = ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(rVarH, ((FormItem.Section) formItem).getSectionId());
            }
        }
        if (rVarA != null) {
            a(rVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(FieldId fieldId, String fileId, FormItem.ItemState itemState) {
        String str;
        String str2;
        HostViewModel.Page page = (HostViewModel.Page) C42745f0.K(this._formViewState.getValue().getCurrentPageIndex(), this._formViewState.getValue().getPages());
        if (page == null) {
            return;
        }
        List<HostViewModel.Page> pages = this._formViewState.getValue().getPages();
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(pages, 10));
        for (HostViewModel.Page pageCopy$default : pages) {
            if (pageCopy$default == page) {
                pageCopy$default = null;
            }
            if (pageCopy$default == null) {
                List<FormItem> items = page.getItems();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(items, i12));
                for (FormItem formItem : items) {
                    FormItem formItemCopy = !L.f(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(formItem), fieldId) ? formItem : null;
                    if (formItemCopy != null) {
                        formItem = formItemCopy;
                    } else {
                        if (formItem instanceof FormItem.FileAttachment) {
                            FormItem.FileAttachment fileAttachment = (FormItem.FileAttachment) formItem;
                            formItemCopy = fileAttachment.copy((239 & 1) != 0 ? fileAttachment.getItem() : null, (239 & 2) != 0 ? fileAttachment.getSectionId() : null, (239 & 4) != 0 ? fileAttachment.getValue() : null, (239 & 8) != 0 ? fileAttachment.hint : null, (239 & 16) != 0 ? fileAttachment.getError() : null, (239 & 32) != 0 ? fileAttachment.fileState : itemState, (239 & 64) != 0 ? fileAttachment.state : null, (239 & 128) != 0 ? fileAttachment.previewUrl : null);
                            formItemCopy.setCondition(formItem.getCondition());
                        } else if (formItem instanceof FormItem.MultiFileAttachments) {
                            FormItem.MultiFileAttachments multiFileAttachments = (FormItem.MultiFileAttachments) formItem;
                            List<FormItem.ItemState> fileStates = multiFileAttachments.getFileStates();
                            ArrayList arrayList3 = new ArrayList(C42745f0.q(fileStates, i12));
                            int i13 = 0;
                            for (Object obj : fileStates) {
                                int i14 = i13 + 1;
                                if (i13 >= 0) {
                                    FormItem.ItemState itemState2 = (FormItem.ItemState) obj;
                                    List<String> values = formItem.getValues();
                                    if (values != null) {
                                        str2 = (String) C42745f0.K(i13, values);
                                        str = fileId;
                                    } else {
                                        str = fileId;
                                        str2 = null;
                                    }
                                    if (L.f(str2, str)) {
                                        itemState2 = null;
                                    }
                                    if (itemState2 == null) {
                                        itemState2 = itemState;
                                    }
                                    arrayList3.add(itemState2);
                                    i13 = i14;
                                } else {
                                    C42745f0.H0();
                                    throw null;
                                }
                            }
                            formItemCopy = multiFileAttachments.copy((495 & 1) != 0 ? multiFileAttachments.getItem() : null, (495 & 2) != 0 ? multiFileAttachments.getSectionId() : null, (495 & 4) != 0 ? multiFileAttachments.getValues() : null, (495 & 8) != 0 ? multiFileAttachments.hint : null, (495 & 16) != 0 ? multiFileAttachments.getError() : null, (495 & 32) != 0 ? multiFileAttachments.getIsMultivalued() : false, (495 & 64) != 0 ? multiFileAttachments.fileStates : arrayList3, (495 & 128) != 0 ? multiFileAttachments.state : null, (495 & 256) != 0 ? multiFileAttachments.previewUrls : null);
                            formItemCopy.setCondition(formItem.getCondition());
                        } else {
                            continue;
                        }
                        formItem = formItemCopy;
                    }
                    arrayList2.add(formItem);
                    i12 = 10;
                }
                pageCopy$default = HostViewModel.Page.copy$default(page, 0, null, null, arrayList2, 7, null);
            }
            arrayList.add(pageCopy$default);
            i12 = 10;
        }
        CBRViewModel.updateState$default(this, false, new r(arrayList, ru.cyberity.cbr.presentation.screen.questionnary.model.c.b((HostViewModel.Page) arrayList.get(this._formViewState.getValue().getCurrentPageIndex())), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(FormItem aItem, List<String> imageIds) {
        ru.cyberity.cbr.core.data.source.applicant.remote.r rVarA;
        if (imageIds.isEmpty()) {
            return;
        }
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "handleFilesDeleted: " + aItem, null, 4, null);
        if (aItem instanceof FormItem.FileAttachment) {
            rVarA = ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(h(), ((FormItem.FileAttachment) aItem).getSectionId(), aItem.getItem().getId(), (String) null);
        } else {
            if (!(aItem instanceof FormItem.MultiFileAttachments)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            FormItem.MultiFileAttachments multiFileAttachments = (FormItem.MultiFileAttachments) aItem;
            List<String> listB = ru.cyberity.cbr.presentation.screen.questionnary.model.f.b(h(), multiFileAttachments.getSectionId(), aItem.getItem().getId());
            if (listB != null) {
                arrayList.addAll(listB);
            }
            arrayList.removeAll(imageIds);
            rVarA = ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(h(), multiFileAttachments.getSectionId(), aItem.getItem().getId(), arrayList);
        }
        a(rVarA);
        m();
        c(false);
    }

    private final void a(FieldId fieldId, FormItem.ItemState itemState) {
        HostViewModel.Page page = (HostViewModel.Page) C42745f0.K(this._formViewState.getValue().getCurrentPageIndex(), this._formViewState.getValue().getPages());
        if (page == null) {
            return;
        }
        List<HostViewModel.Page> pages = this._formViewState.getValue().getPages();
        ArrayList arrayList = new ArrayList(C42745f0.q(pages, 10));
        for (HostViewModel.Page pageCopy$default : pages) {
            if (pageCopy$default == page) {
                pageCopy$default = null;
            }
            if (pageCopy$default == null) {
                List<FormItem> items = page.getItems();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(items, 10));
                for (FormItem formItemCopy : items) {
                    FormItem formItemCopy2 = !L.f(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(formItemCopy), fieldId) ? formItemCopy : null;
                    if (formItemCopy2 != null) {
                        formItemCopy = formItemCopy2;
                    } else if (formItemCopy instanceof FormItem.FileAttachment) {
                        FormItem.FileAttachment fileAttachment = (FormItem.FileAttachment) formItemCopy;
                        formItemCopy2 = fileAttachment.copy((239 & 1) != 0 ? fileAttachment.getItem() : null, (239 & 2) != 0 ? fileAttachment.getSectionId() : null, (239 & 4) != 0 ? fileAttachment.getValue() : null, (239 & 8) != 0 ? fileAttachment.hint : null, (239 & 16) != 0 ? fileAttachment.getError() : null, (239 & 32) != 0 ? fileAttachment.fileState : null, (239 & 64) != 0 ? fileAttachment.state : itemState, (239 & 128) != 0 ? fileAttachment.previewUrl : null);
                        formItemCopy2.setCondition(formItemCopy.getCondition());
                        formItemCopy = formItemCopy2;
                    } else if (formItemCopy instanceof FormItem.MultiFileAttachments) {
                        FormItem.MultiFileAttachments multiFileAttachments = (FormItem.MultiFileAttachments) formItemCopy;
                        formItemCopy = multiFileAttachments.copy((495 & 1) != 0 ? multiFileAttachments.getItem() : null, (495 & 2) != 0 ? multiFileAttachments.getSectionId() : null, (495 & 4) != 0 ? multiFileAttachments.getValues() : null, (495 & 8) != 0 ? multiFileAttachments.hint : null, (495 & 16) != 0 ? multiFileAttachments.getError() : null, (495 & 32) != 0 ? multiFileAttachments.getIsMultivalued() : false, (495 & 64) != 0 ? multiFileAttachments.fileStates : null, (495 & 128) != 0 ? multiFileAttachments.state : itemState, (495 & 256) != 0 ? multiFileAttachments.previewUrls : null);
                    }
                    arrayList2.add(formItemCopy);
                }
                pageCopy$default = HostViewModel.Page.copy$default(page, 0, null, null, arrayList2, 7, null);
            }
            arrayList.add(pageCopy$default);
        }
        CBRViewModel.updateState$default(this, false, new s(arrayList, ru.cyberity.cbr.presentation.screen.questionnary.model.c.b((HostViewModel.Page) arrayList.get(this._formViewState.getValue().getCurrentPageIndex())), null), 1, null);
    }

    private final HostViewModel.Page a(HostViewModel.Page page, List<FieldId> list) {
        FormItem.ItemState itemState;
        FormItem formItemCopy;
        List<FormItem> items = page.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        for (FormItem formItem : items) {
            if (formItem instanceof FormItem.FileAttachment) {
                FormItem.FileAttachment fileAttachment = (FormItem.FileAttachment) formItem;
                itemState = list.contains(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(formItem)) ? FormItem.ItemState.LOADING : null;
                formItemCopy = fileAttachment.copy((239 & 1) != 0 ? fileAttachment.getItem() : null, (239 & 2) != 0 ? fileAttachment.getSectionId() : null, (239 & 4) != 0 ? fileAttachment.getValue() : null, (239 & 8) != 0 ? fileAttachment.hint : null, (239 & 16) != 0 ? fileAttachment.getError() : null, (239 & 32) != 0 ? fileAttachment.fileState : null, (239 & 64) != 0 ? fileAttachment.state : itemState == null ? FormItem.ItemState.DEFAULT : itemState, (239 & 128) != 0 ? fileAttachment.previewUrl : null);
                formItemCopy.setCondition(formItem.getCondition());
            } else if (formItem instanceof FormItem.MultiFileAttachments) {
                FormItem.MultiFileAttachments multiFileAttachments = (FormItem.MultiFileAttachments) formItem;
                itemState = list.contains(ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(formItem)) ? FormItem.ItemState.LOADING : null;
                formItemCopy = multiFileAttachments.copy((495 & 1) != 0 ? multiFileAttachments.getItem() : null, (495 & 2) != 0 ? multiFileAttachments.getSectionId() : null, (495 & 4) != 0 ? multiFileAttachments.getValues() : null, (495 & 8) != 0 ? multiFileAttachments.hint : null, (495 & 16) != 0 ? multiFileAttachments.getError() : null, (495 & 32) != 0 ? multiFileAttachments.getIsMultivalued() : false, (495 & 64) != 0 ? multiFileAttachments.fileStates : null, (495 & 128) != 0 ? multiFileAttachments.state : itemState == null ? FormItem.ItemState.DEFAULT : itemState, (495 & 256) != 0 ? multiFileAttachments.previewUrls : null);
                formItemCopy.setCondition(formItem.getCondition());
            } else {
                arrayList.add(formItem);
            }
            formItem = formItemCopy;
            arrayList.add(formItem);
        }
        return HostViewModel.Page.copy$default(page, 0, null, null, arrayList, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(FieldId aItem, List<ru.cyberity.cbr.core.data.model.remote.k> remoteIdDocs) {
        ru.cyberity.cbr.core.data.source.applicant.remote.r rVarA;
        String strQ;
        if (remoteIdDocs.isEmpty()) {
            return;
        }
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "handleFilesUploaded: " + aItem, null, 4, null);
        FormItem formItemA = a(aItem);
        if (formItemA == null) {
            return;
        }
        if (formItemA instanceof FormItem.FileAttachment) {
            ru.cyberity.cbr.core.data.model.remote.k kVar = (ru.cyberity.cbr.core.data.model.remote.k) C42745f0.G(remoteIdDocs);
            if (kVar == null || (strQ = kVar.q()) == null) {
                return;
            } else {
                rVarA = ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(h(), aItem.getSectionId(), aItem.getItemId(), strQ);
            }
        } else {
            if (!(formItemA instanceof FormItem.MultiFileAttachments)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (ru.cyberity.cbr.core.data.model.remote.k kVar2 : remoteIdDocs) {
                String strQ2 = kVar2 != null ? kVar2.q() : null;
                if (strQ2 != null) {
                    arrayList.add(strQ2);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            List<String> listB = ru.cyberity.cbr.presentation.screen.questionnary.model.f.b(h(), aItem.getSectionId(), aItem.getItemId());
            if (listB != null) {
                arrayList2.addAll(listB);
            }
            rVarA = ru.cyberity.cbr.presentation.screen.questionnary.model.f.a(h(), aItem.getSectionId(), aItem.getItemId(), arrayList2);
        }
        a(rVarA);
        c(false);
        m();
    }

    private final FormItem a(FieldId fieldId) {
        FormItem formItemA = ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(currentState().h(), fieldId);
        if (formItemA != null) {
            return formItemA;
        }
        if (!currentState().h().isEmpty()) {
            return null;
        }
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "loading page list ...", null, 4, null);
        List<HostViewModel.Page> listJ = j();
        if (listJ != null) {
            return ru.cyberity.cbr.presentation.screen.questionnary.model.c.a(listJ, fieldId);
        }
        return null;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a7 -> B:36:0x00d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c4 -> B:35:0x00cb). Please report as a decompilation issue!!! */
    public final java.lang.Object a(android.content.Context r22, java.util.List<? extends android.net.Uri> r23, java.lang.String r24, kotlin.coroutines.Continuation<? super java.util.List<ru.cyberity.cbr.core.data.model.o>> r25) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.questionnary.model.a.a(android.content.Context, java.util.List, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String message, Exception e12) {
        C43259k.d(androidx.view.N0.a(this), C43135f1.f411090b, null, new o(message, e12, null), 2);
    }

    private final void a(ru.cyberity.cbr.core.data.source.applicant.remote.r currentQuestionnaire) {
        v vVarF = f();
        a(vVarF != null ? v.a(vVarF, null, C42745f0.e0(currentQuestionnaire), 1, null) : null);
    }
}
