package ru.cyberity.cbr.presentation.screen.preview.ekyc;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.L0;
import kotlin.collections.P0;
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
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.x0;
import ru.cyberity.cbr.core.common.y0;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.CBRException;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.h;
import ru.cyberity.cbr.core.data.source.applicant.remote.ConfirmationStatus;
import ru.cyberity.cbr.core.data.source.applicant.remote.ConfirmationType;
import ru.cyberity.cbr.core.data.source.applicant.remote.EKycFlowStatus;
import ru.cyberity.cbr.core.data.source.applicant.remote.a0;
import ru.cyberity.cbr.core.data.source.dynamic.c;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.ItemValueCache;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.presentation.screen.preview.b;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBREkycViewModel.kt */
@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u009c\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004@MSUB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001c\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\"J!\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0014¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014¢\u0006\u0004\b+\u0010*J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0017\u0010\u001c\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b\u001c\u00101J\r\u00102\u001a\u00020\u0014¢\u0006\u0004\b2\u0010*J\r\u00103\u001a\u00020\u0014¢\u0006\u0004\b3\u0010*J\u001f\u0010\u001c\u001a\u00020,2\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\u001c\u00107J\u000f\u00108\u001a\u00020\u0014H\u0014¢\u0006\u0004\b8\u0010*J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u00109\u001a\u00020,H\u0016¢\u0006\u0004\b\u001c\u0010:J)\u0010@\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u00010%2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b@\u0010AJ#\u0010\u001c\u001a\u0004\u0018\u00010=*\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\b\u001c\u0010DJ?\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010%0H2\u0006\u0010F\u001a\u00020E2\b\u0010G\u001a\u0004\u0018\u00010%2\u0006\u0010;\u001a\u00020%H\u0002¢\u0006\u0004\b\u001c\u0010IJ)\u0010\u001c\u001a\u00020?2\b\u0010G\u001a\u0004\u0018\u00010%2\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002¢\u0006\u0004\b\u001c\u0010AJ#\u0010M\u001a\u00020L2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0JH\u0002¢\u0006\u0004\bM\u0010NJ!\u0010\u001c\u001a\u00020\u00142\u0006\u00100\u001a\u00020/2\b\u0010P\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\b\u001c\u0010QJ\u0019\u0010S\u001a\u00020\u00142\b\u0010R\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00142\u0006\u0010R\u001a\u00020OH\u0002¢\u0006\u0004\bU\u0010TJ'\u0010\u001c\u001a\u00020\u00142\u0006\u0010V\u001a\u00020%2\u0006\u0010W\u001a\u00020%2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\b\u001c\u0010ZJ\u0019\u0010\u001c\u001a\u00020\u00142\b\u0010R\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\b\u001c\u0010TJ\u0017\u0010@\u001a\u00020\u00142\u0006\u0010R\u001a\u00020OH\u0002¢\u0006\u0004\b@\u0010TJ\u0017\u0010M\u001a\u00020\u00142\u0006\u0010R\u001a\u00020OH\u0002¢\u0006\u0004\bM\u0010TJ\u0019\u0010\u001c\u001a\u00020\u00142\b\u0010\\\u001a\u0004\u0018\u00010[H\u0002¢\u0006\u0004\b\u001c\u0010]J\u000f\u0010^\u001a\u00020\u0014H\u0002¢\u0006\u0004\b^\u0010*J\u0019\u0010_\u001a\u00020\u00142\b\u0010R\u001a\u0004\u0018\u00010OH\u0002¢\u0006\u0004\b_\u0010TJ\u000f\u0010`\u001a\u00020?H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010\u001c\u001a\u00020b*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010cJ\u0017\u0010@\u001a\u00020d*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010cJ\u0013\u0010\u001c\u001a\u00020bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0016J\u0013\u0010@\u001a\u00020dH\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010\u0016J\u001b\u0010\u001c\u001a\u00020/2\u0006\u0010f\u001a\u00020eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010gJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010%*\u00020hH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010iJ)\u0010\u001c\u001a\u0004\u0018\u00010%2\b\u0010j\u001a\u0004\u0018\u00010%2\b\u0010;\u001a\u0004\u0018\u00010%H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010kR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010lR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010mR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010oR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010qR\u0016\u0010s\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R \u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001RJ\u0010\u0097\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0J2\u0013\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0J8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0005\bS\u0010\u0096\u0001R\u001f\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u008d\u00010\u0098\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u009d\u0001"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b;", "Lru/cyberity/cbr/presentation/screen/preview/b;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Lru/cyberity/cbr/core/data/source/extensions/a;", "extensionProvider", "Lru/cyberity/cbr/core/data/source/applicant/b;", "applicantRepository", "Landroidx/lifecycle/r0;", "savedStateHandle", "Lru/cyberity/cbr/core/data/source/common/a;", "commonRepository", "Lru/cyberity/cbr/core/data/source/dynamic/c;", "dataRepository", "Lru/cyberity/cbr/core/domain/b;", "countriesUseCase", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Lru/cyberity/cbr/core/data/source/extensions/a;Lru/cyberity/cbr/core/data/source/applicant/b;Landroidx/lifecycle/r0;Lru/cyberity/cbr/core/data/source/common/a;Lru/cyberity/cbr/core/data/source/dynamic/c;Lru/cyberity/cbr/core/domain/b;)V", "Lkotlin/G0;", "onPrepare", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$b;", "k", "()Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$b;", "Lru/cyberity/cbr/core/domain/c;", "countriesResultData", "a", "(Lru/cyberity/cbr/core/domain/c;)V", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "Lru/cyberity/cbr/core/data/model/e;", Navigation.CONFIG, "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "field", "", "value", "onFieldValueChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/lang/String;)V", "q", "()V", "n", "", "j", "()Z", "", "code", "(Ljava/lang/CharSequence;)V", "m", "o", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "aCallbackUrl", "(Landroid/net/Uri;Ljava/lang/String;)Z", "onCleared", "show", "(Z)V", "sourceId", "", "Lru/cyberity/cbr/domain/b;", "fieldsErrors", "Lkotlinx/coroutines/N0;", "b", "(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/N0;", "Lru/cyberity/cbr/core/data/model/FieldName;", "fieldName", "(Ljava/util/List;Lru/cyberity/cbr/core/data/model/FieldName;)Lru/cyberity/cbr/domain/b;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "country", "Lkotlin/Function2;", "(Lru/cyberity/cbr/core/data/source/dynamic/c$c;Ljava/lang/String;Ljava/lang/String;)LY41/p;", "", RequestReviewResultKt.INFO_TYPE, "Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "c", "(Ljava/util/Map;)Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "submitResponse", "(Ljava/lang/CharSequence;Lru/cyberity/cbr/core/data/source/applicant/remote/a0;)V", "response", "d", "(Lru/cyberity/cbr/core/data/source/applicant/remote/a0;)V", "e", "applicantId", "confirmationId", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "data", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/a;)V", "Lru/cyberity/cbr/core/data/source/applicant/remote/EKycFlowStatus;", "status", "(Lru/cyberity/cbr/core/data/source/applicant/remote/EKycFlowStatus;)V", "r", "f", "p", "()Lkotlinx/coroutines/N0;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$a;", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$e;", "", "remaining", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/CBRException$Api;", "(Lru/cyberity/cbr/core/data/model/CBRException$Api;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/extensions/a;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "Lru/cyberity/cbr/core/common/y0;", "Lru/cyberity/cbr/core/common/y0;", "tinValidator", "Lru/cyberity/cbr/core/data/model/g;", "Z", "isSkipable", "Lkotlinx/coroutines/N0;", "countDownTimerJob", "Lkotlinx/coroutines/T;", "s", "Lkotlinx/coroutines/T;", "timerScope", "Lru/cyberity/cbr/domain/c;", "t", "Lru/cyberity/cbr/domain/c;", "resources", "u", "Ljava/lang/String;", "currentSourceId", "v", "currentConfirmationId", "w", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "lastOAuthConfirmModel", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "x", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "getItemValueCache", "()Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "itemValueCache", "Lkotlinx/coroutines/flow/Z1;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", "y", "Lkotlinx/coroutines/flow/Z1;", "_formViewState", "<set-?>", "z", "Lru/cyberity/cbr/core/presentation/screen/base/a;", "l", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "fieldValueCache", "Lkotlinx/coroutines/flow/n2;", "getFormViewState", "()Lkotlinx/coroutines/flow/n2;", "formViewState", "A", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends ru.cyberity.cbr.presentation.screen.preview.b<e> implements HostViewModel {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.extensions.a extensionProvider;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.data.source.applicant.b applicantRepository;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final y0 tinValidator;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ru.cyberity.cbr.core.data.model.g applicant;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isSkipable;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private N0 countDownTimerJob;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final T timerScope;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ru.cyberity.cbr.domain.c resources;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private String currentSourceId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private String currentConfirmationId;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private ru.cyberity.cbr.core.data.source.applicant.remote.a lastOAuthConfirmModel;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ItemValueCache itemValueCache;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final Z1<HostViewModel.FormViewState> _formViewState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final ru.cyberity.cbr.core.presentation.screen.base.a fieldValueCache;

    /* renamed from: B, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f434872B = {m0.f406844a.e(new Y(b.class, "fieldValueCache", "getFieldValueCache()Ljava/util/Map;", 0))};

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$1", f = "CBREkycViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<e, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434887a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434888b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super G0> continuation) {
            return ((a) create(eVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f434888b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434887a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            e eVar = (e) this.f434888b;
            if (eVar instanceof e.a) {
                Z1 z12 = b.this._formViewState;
                e.a aVar = (e.a) eVar;
                CharSequence title = aVar.getTitle();
                String string = title != null ? title.toString() : null;
                CharSequence subtitle = aVar.getSubtitle();
                z12.setValue(new HostViewModel.FormViewState(0, Collections.singletonList(new HostViewModel.Page(0, string, subtitle != null ? subtitle.toString() : null, aVar.m())), null, new HostViewModel.ValidationStrings(null, null, 3, null)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$b;", "Landroidx/lifecycle/a;", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Lru/cyberity/cbr/core/b;", "serviceLocator", "Landroid/os/Bundle;", "args", "<init>", "(Lru/cyberity/cbr/core/data/model/Document;Landroidx/savedstate/e;Lru/cyberity/cbr/core/b;Landroid/os/Bundle;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/r0;", VoiceInfo.STATE, "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "a", "Lru/cyberity/cbr/core/data/model/Document;", "b", "Lru/cyberity/cbr/core/b;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.ekyc.b$b, reason: collision with other inner class name */
    public static final class C12523b extends AbstractC22993a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final Document document;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.b serviceLocator;

        public /* synthetic */ C12523b(Document document, InterfaceC23487e interfaceC23487e, ru.cyberity.cbr.core.b bVar, Bundle bundle, int i12, C42822w c42822w) {
            this(document, interfaceC23487e, bVar, (i12 & 8) != 0 ? null : bundle);
        }

        @Override // androidx.view.AbstractC22993a
        @Y61.k
        public <T extends M0> T create(@Y61.k String key, @Y61.k Class<T> modelClass, @Y61.k C23060r0 state) {
            return new b(this.document, this.serviceLocator.getExtensionProvider(), this.serviceLocator.e(), state, this.serviceLocator.k(), this.serviceLocator.m(), new ru.cyberity.cbr.core.domain.b(this.serviceLocator.k(), this.serviceLocator.m()));
        }

        public C12523b(@Y61.k Document document, @Y61.k InterfaceC23487e interfaceC23487e, @Y61.k ru.cyberity.cbr.core.b bVar, @Y61.l Bundle bundle) {
            super(interfaceC23487e, bundle);
            this.document = document;
            this.serviceLocator = bVar;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$d;", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "", "errorText", "buttonText", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "b", "c", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d implements CBRViewModel.CBRViewModelEvent {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence errorText;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final CharSequence buttonText;

        public d(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2) {
            this.errorText = charSequence;
            this.buttonText = charSequence2;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final CharSequence getButtonText() {
            return this.buttonText;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final CharSequence getErrorText() {
            return this.errorText;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return L.f(this.errorText, dVar.errorText) && L.f(this.buttonText, dVar.buttonText);
        }

        public int hashCode() {
            CharSequence charSequence = this.errorText;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.buttonText;
            return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorEvent(errorText=");
            sb2.append((Object) this.errorText);
            sb2.append(", buttonText=");
            return AK.c.r(sb2, this.buttonText, ')');
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "Lru/cyberity/cbr/presentation/screen/preview/b$a;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$a;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$b;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$c;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$d;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$e;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$f;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class e extends b.a {

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010Jr\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010\u0014R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$a;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "", "title", "subtitle", "buttonContinue", "buttonSkip", "Lru/cyberity/cbr/domain/c;", "resources", "", "currentCountry", "currentSourceId", "", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "formItems", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/domain/c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lru/cyberity/cbr/domain/c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "p", "()Ljava/lang/CharSequence;", "b", "o", "c", "i", "d", "j", "e", "Lru/cyberity/cbr/domain/c;", "n", "()Lru/cyberity/cbr/domain/c;", "f", "Ljava/lang/String;", "k", "g", "l", "h", "Ljava/util/List;", "m", "()Ljava/util/List;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence subtitle;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence buttonContinue;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence buttonSkip;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final ru.cyberity.cbr.domain.c resources;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String currentCountry;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String currentSourceId;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final List<FormItem> formItems;

            public a() {
                this(null, null, null, null, null, null, null, null, 255, null);
            }

            @Y61.k
            public final a a(@Y61.l CharSequence title, @Y61.l CharSequence subtitle, @Y61.l CharSequence buttonContinue, @Y61.l CharSequence buttonSkip, @Y61.k ru.cyberity.cbr.domain.c resources, @Y61.l String currentCountry, @Y61.l String currentSourceId, @Y61.k List<? extends FormItem> formItems) {
                return new a(title, subtitle, buttonContinue, buttonSkip, resources, currentCountry, currentSourceId, formItems);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return L.f(this.title, aVar.title) && L.f(this.subtitle, aVar.subtitle) && L.f(this.buttonContinue, aVar.buttonContinue) && L.f(this.buttonSkip, aVar.buttonSkip) && L.f(this.resources, aVar.resources) && L.f(this.currentCountry, aVar.currentCountry) && L.f(this.currentSourceId, aVar.currentSourceId) && L.f(this.formItems, aVar.formItems);
            }

            public int hashCode() {
                CharSequence charSequence = this.title;
                int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                CharSequence charSequence2 = this.subtitle;
                int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.buttonContinue;
                int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
                CharSequence charSequence4 = this.buttonSkip;
                int iHashCode4 = (this.resources.hashCode() + ((iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31)) * 31;
                String str = this.currentCountry;
                int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.currentSourceId;
                return this.formItems.hashCode() + ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Y61.l
            /* renamed from: i, reason: from getter */
            public final CharSequence getButtonContinue() {
                return this.buttonContinue;
            }

            @Y61.l
            /* renamed from: j, reason: from getter */
            public final CharSequence getButtonSkip() {
                return this.buttonSkip;
            }

            @Y61.l
            /* renamed from: k, reason: from getter */
            public final String getCurrentCountry() {
                return this.currentCountry;
            }

            @Y61.l
            /* renamed from: l, reason: from getter */
            public final String getCurrentSourceId() {
                return this.currentSourceId;
            }

            @Y61.k
            public final List<FormItem> m() {
                return this.formItems;
            }

            @Y61.k
            /* renamed from: n, reason: from getter */
            public final ru.cyberity.cbr.domain.c getResources() {
                return this.resources;
            }

            @Y61.l
            /* renamed from: o, reason: from getter */
            public final CharSequence getSubtitle() {
                return this.subtitle;
            }

            @Y61.l
            /* renamed from: p, reason: from getter */
            public final CharSequence getTitle() {
                return this.title;
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AppData(title=");
                sb2.append((Object) this.title);
                sb2.append(", subtitle=");
                sb2.append((Object) this.subtitle);
                sb2.append(", buttonContinue=");
                sb2.append((Object) this.buttonContinue);
                sb2.append(", buttonSkip=");
                sb2.append((Object) this.buttonSkip);
                sb2.append(", resources=");
                sb2.append(this.resources);
                sb2.append(", currentCountry=");
                sb2.append(this.currentCountry);
                sb2.append(", currentSourceId=");
                sb2.append(this.currentSourceId);
                sb2.append(", formItems=");
                return H.p(sb2, this.formItems, ')');
            }

            public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ru.cyberity.cbr.domain.c cVar, String str, String str2, List list, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3, (i12 & 8) != 0 ? null : charSequence4, (i12 & 16) != 0 ? new ru.cyberity.cbr.domain.c(null, null, null, null, null, 31, null) : cVar, (i12 & 32) != 0 ? null : str, (i12 & 64) == 0 ? str2 : null, (i12 & 128) != 0 ? C42784z0.f406748b : list);
            }

            public static /* synthetic */ a a(a aVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ru.cyberity.cbr.domain.c cVar, String str, String str2, List list, int i12, Object obj) {
                return aVar.a((i12 & 1) != 0 ? aVar.title : charSequence, (i12 & 2) != 0 ? aVar.subtitle : charSequence2, (i12 & 4) != 0 ? aVar.buttonContinue : charSequence3, (i12 & 8) != 0 ? aVar.buttonSkip : charSequence4, (i12 & 16) != 0 ? aVar.resources : cVar, (i12 & 32) != 0 ? aVar.currentCountry : str, (i12 & 64) != 0 ? aVar.currentSourceId : str2, (i12 & 128) != 0 ? aVar.formItems : list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4, @Y61.k ru.cyberity.cbr.domain.c cVar, @Y61.l String str, @Y61.l String str2, @Y61.k List<? extends FormItem> list) {
                super(null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.buttonContinue = charSequence3;
                this.buttonSkip = charSequence4;
                this.resources = cVar;
                this.currentCountry = str;
                this.currentSourceId = str2;
                this.formItems = list;
            }
        }

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$b;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$b, reason: collision with other inner class name */
        public static final class C12524b extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12524b f434902a = new C12524b();

            private C12524b() {
                super(null);
            }
        }

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$c;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class c extends e {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f434903a = new c();

            private c() {
                super(null);
            }
        }

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$d;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "", ContextActionHandler.Link.URL, "callbackUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class d extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String url;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String callbackUrl;

            public d(@Y61.l String str, @Y61.l String str2) {
                super(null);
                this.url = str;
                this.callbackUrl = str2;
            }

            @Y61.l
            /* renamed from: c, reason: from getter */
            public final String getCallbackUrl() {
                return this.callbackUrl;
            }

            @Y61.l
            /* renamed from: d, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return L.f(this.url, dVar.url) && L.f(this.callbackUrl, dVar.callbackUrl);
            }

            public int hashCode() {
                String str = this.url;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.callbackUrl;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("OAuth(url=");
                sb2.append(this.url);
                sb2.append(", callbackUrl=");
                return C22026a.c(sb2, this.callbackUrl, ')');
            }
        }

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$e;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "", "title", "subtitle", "buttonResendCode", "error", "", "secondsRemaining", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "submitResponse", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;JLru/cyberity/cbr/core/data/source/applicant/remote/a0;)V", "a", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;JLru/cyberity/cbr/core/data/source/applicant/remote/a0;)Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "l", "()Ljava/lang/CharSequence;", "b", "k", "c", "g", "d", "h", "e", "J", "i", "()J", "f", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "j", "()Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e, reason: collision with other inner class name */
        public static final /* data */ class C12525e extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence subtitle;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence buttonResendCode;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence error;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final long secondsRemaining;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final a0 submitResponse;

            public C12525e() {
                this(null, null, null, null, 0L, null, 63, null);
            }

            @Y61.k
            public final C12525e a(@Y61.l CharSequence title, @Y61.l CharSequence subtitle, @Y61.l CharSequence buttonResendCode, @Y61.l CharSequence error, long secondsRemaining, @Y61.l a0 submitResponse) {
                return new C12525e(title, subtitle, buttonResendCode, error, secondsRemaining, submitResponse);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C12525e)) {
                    return false;
                }
                C12525e c12525e = (C12525e) other;
                return L.f(this.title, c12525e.title) && L.f(this.subtitle, c12525e.subtitle) && L.f(this.buttonResendCode, c12525e.buttonResendCode) && L.f(this.error, c12525e.error) && this.secondsRemaining == c12525e.secondsRemaining && L.f(this.submitResponse, c12525e.submitResponse);
            }

            @Y61.l
            /* renamed from: g, reason: from getter */
            public final CharSequence getButtonResendCode() {
                return this.buttonResendCode;
            }

            @Y61.l
            /* renamed from: h, reason: from getter */
            public final CharSequence getError() {
                return this.error;
            }

            public int hashCode() {
                CharSequence charSequence = this.title;
                int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                CharSequence charSequence2 = this.subtitle;
                int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
                CharSequence charSequence3 = this.buttonResendCode;
                int iHashCode3 = (iHashCode2 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
                CharSequence charSequence4 = this.error;
                int iG2 = androidx.appcompat.app.r.g((iHashCode3 + (charSequence4 == null ? 0 : charSequence4.hashCode())) * 31, 31, this.secondsRemaining);
                a0 a0Var = this.submitResponse;
                return iG2 + (a0Var != null ? a0Var.hashCode() : 0);
            }

            /* renamed from: i, reason: from getter */
            public final long getSecondsRemaining() {
                return this.secondsRemaining;
            }

            @Y61.l
            /* renamed from: j, reason: from getter */
            public final a0 getSubmitResponse() {
                return this.submitResponse;
            }

            @Y61.l
            /* renamed from: k, reason: from getter */
            public final CharSequence getSubtitle() {
                return this.subtitle;
            }

            @Y61.l
            /* renamed from: l, reason: from getter */
            public final CharSequence getTitle() {
                return this.title;
            }

            @Y61.k
            public String toString() {
                return "OtpConfirm(title=" + ((Object) this.title) + ", subtitle=" + ((Object) this.subtitle) + ", buttonResendCode=" + ((Object) this.buttonResendCode) + ", error=" + ((Object) this.error) + ", secondsRemaining=" + this.secondsRemaining + ", submitResponse=" + this.submitResponse + ')';
            }

            public /* synthetic */ C12525e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, long j12, a0 a0Var, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : charSequence, (i12 & 2) != 0 ? null : charSequence2, (i12 & 4) != 0 ? null : charSequence3, (i12 & 8) != 0 ? null : charSequence4, (i12 & 16) != 0 ? 0L : j12, (i12 & 32) != 0 ? null : a0Var);
            }

            public static /* synthetic */ C12525e a(C12525e c12525e, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, long j12, a0 a0Var, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    charSequence = c12525e.title;
                }
                if ((i12 & 2) != 0) {
                    charSequence2 = c12525e.subtitle;
                }
                CharSequence charSequence5 = charSequence2;
                if ((i12 & 4) != 0) {
                    charSequence3 = c12525e.buttonResendCode;
                }
                CharSequence charSequence6 = charSequence3;
                if ((i12 & 8) != 0) {
                    charSequence4 = c12525e.error;
                }
                CharSequence charSequence7 = charSequence4;
                if ((i12 & 16) != 0) {
                    j12 = c12525e.secondsRemaining;
                }
                long j13 = j12;
                if ((i12 & 32) != 0) {
                    a0Var = c12525e.submitResponse;
                }
                return c12525e.a(charSequence, charSequence5, charSequence6, charSequence7, j13, a0Var);
            }

            public C12525e(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.l CharSequence charSequence3, @Y61.l CharSequence charSequence4, long j12, @Y61.l a0 a0Var) {
                super(null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.buttonResendCode = charSequence3;
                this.error = charSequence4;
                this.secondsRemaining = j12;
                this.submitResponse = a0Var;
            }
        }

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0003\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e$f;", "Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "", "a", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "title", "b", "c", "subtitle", "", "Ljava/lang/String;", "()Ljava/lang/String;", "icon", "primaryButton", "", "e", "Z", "()Z", "isFailure", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Z)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
        public static final class f extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence subtitle;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final String icon;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final CharSequence primaryButton;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final boolean isFailure;

            public f(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, @Y61.k String str, @Y61.l CharSequence charSequence3, boolean z12) {
                super(null);
                this.title = charSequence;
                this.subtitle = charSequence2;
                this.icon = str;
                this.primaryButton = charSequence3;
                this.isFailure = z12;
            }

            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @Y61.l
            /* renamed from: b, reason: from getter */
            public final CharSequence getPrimaryButton() {
                return this.primaryButton;
            }

            @Y61.l
            /* renamed from: c, reason: from getter */
            public final CharSequence getSubtitle() {
                return this.subtitle;
            }

            @Y61.l
            /* renamed from: d, reason: from getter */
            public final CharSequence getTitle() {
                return this.title;
            }

            /* renamed from: e, reason: from getter */
            public final boolean getIsFailure() {
                return this.isFailure;
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        private e() {
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434917a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f434918b;

        static {
            int[] iArr = new int[ConfirmationType.values().length];
            iArr[ConfirmationType.OTP.ordinal()] = 1;
            iArr[ConfirmationType.OAUTH.ordinal()] = 2;
            f434917a = iArr;
            int[] iArr2 = new int[EKycFlowStatus.values().length];
            iArr2[EKycFlowStatus.COMPLETED.ordinal()] = 1;
            iArr2[EKycFlowStatus.SKIPPED.ordinal()] = 2;
            iArr2[EKycFlowStatus.REJECTED.ordinal()] = 3;
            f434918b = iArr2;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$confirmOAuthData$1", f = "CBREkycViewModel.kt", i = {}, l = {567}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434919a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f434921c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f434922d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.cyberity.cbr.core.data.source.applicant.remote.a f434923e;

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$confirmOAuthData$1$1", f = "CBREkycViewModel.kt", i = {}, l = {579, 580, 582}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434924a;

            /* renamed from: b, reason: collision with root package name */
            Object f434925b;

            /* renamed from: c, reason: collision with root package name */
            Object f434926c;

            /* renamed from: d, reason: collision with root package name */
            int f434927d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f434928e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Exception f434929f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Exception exc, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f434928e = bVar;
                this.f434929f = exc;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f434928e, this.f434929f, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r7.f434927d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L3d
                    if (r1 == r4) goto L39
                    if (r1 == r3) goto L2d
                    if (r1 != r2) goto L25
                    java.lang.Object r0 = r7.f434926c
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r1 = r7.f434925b
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    java.lang.Object r2 = r7.f434924a
                    java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                    kotlin.C42729a0.b(r8)
                    r3 = r0
                    r6 = r2
                L22:
                    r2 = r1
                    r1 = r6
                    goto L8a
                L25:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L2d:
                    java.lang.Object r1 = r7.f434925b
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    java.lang.Object r3 = r7.f434924a
                    java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                    kotlin.C42729a0.b(r8)
                    goto L67
                L39:
                    kotlin.C42729a0.b(r8)
                    goto L4d
                L3d:
                    kotlin.C42729a0.b(r8)
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b r8 = r7.f434928e
                    r7.f434927d = r4
                    java.lang.String r1 = "sns_confirmation_result_ekyc_failure_title"
                    java.lang.Object r8 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r8, r1, r7)
                    if (r8 != r0) goto L4d
                    return r0
                L4d:
                    java.lang.String r8 = (java.lang.String) r8
                    if (r8 != 0) goto L53
                    java.lang.String r8 = "Error"
                L53:
                    java.lang.Exception r1 = r7.f434929f
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b r4 = r7.f434928e
                    r7.f434924a = r8
                    r7.f434925b = r1
                    r7.f434927d = r3
                    java.lang.Object r3 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.c(r4, r7)
                    if (r3 != r0) goto L64
                    return r0
                L64:
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L67:
                    ru.cyberity.cbr.core.data.source.dynamic.c$c r8 = (ru.cyberity.cbr.core.data.source.dynamic.c.C12476c) r8
                    java.lang.String r1 = ru.cyberity.cbr.core.common.y.a(r1, r8)
                    ru.cyberity.cbr.core.data.listener.CBRIconHandler$CBRResultIcons r8 = ru.cyberity.cbr.core.data.listener.CBRIconHandler.CBRResultIcons.FAILURE
                    java.lang.String r8 = r8.getImageName()
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b r4 = r7.f434928e
                    r7.f434924a = r3
                    r7.f434925b = r1
                    r7.f434926c = r8
                    r7.f434927d = r2
                    java.lang.String r2 = "sns_confirmation_result_action_tryAgain"
                    java.lang.Object r2 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r4, r2, r7)
                    if (r2 != r0) goto L86
                    return r0
                L86:
                    r6 = r3
                    r3 = r8
                    r8 = r2
                    goto L22
                L8a:
                    r4 = r8
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$f r8 = new ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$f
                    r5 = 1
                    r0 = r8
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, ru.cyberity.cbr.core.data.source.applicant.remote.a aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f434921c = str;
            this.f434922d = str2;
            this.f434923e = aVar;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new g(this.f434921c, this.f434922d, this.f434923e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434919a;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    Logger.d$default(ru.cyberity.log.a.f436064a, "EKyc", "confirmOAuthData ...", null, 4, null);
                    ru.cyberity.cbr.core.data.source.applicant.b bVar = b.this.applicantRepository;
                    String str = this.f434921c;
                    String str2 = this.f434922d;
                    ru.cyberity.cbr.core.data.source.applicant.remote.a aVar = this.f434923e;
                    this.f434919a = 1;
                    obj = bVar.a(str, str2, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                b.this.a((a0) obj);
            } catch (Exception e12) {
                b.this.showProgress(false);
                b.this.a(true);
                b bVar2 = b.this;
                CBRViewModel.updateState$default(bVar2, false, new a(bVar2, e12, null), 1, null);
            } catch (Throwable th2) {
                ru.cyberity.cbr.presentation.screen.preview.b.a(b.this, th2, null, 2, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$confirmOtp$1", f = "CBREkycViewModel.kt", i = {}, l = {435}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434930a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f434932c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CharSequence f434933d;

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$confirmOtp$1$1", f = "CBREkycViewModel.kt", i = {}, l = {443, 445, 447}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f434934a;

            /* renamed from: b, reason: collision with root package name */
            Object f434935b;

            /* renamed from: c, reason: collision with root package name */
            int f434936c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f434937d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Exception f434938e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a0 f434939f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Exception exc, a0 a0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f434937d = bVar;
                this.f434938e = exc;
                this.f434939f = a0Var;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f434937d, this.f434938e, this.f434939f, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r11.f434936c
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r4) goto L33
                    if (r1 == r3) goto L27
                    if (r1 != r2) goto L1f
                    java.lang.Object r0 = r11.f434935b
                    java.lang.String r0 = (java.lang.String) r0
                    java.lang.Object r1 = r11.f434934a
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r1 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e) r1
                    kotlin.C42729a0.b(r12)
                    r4 = r0
                    r0 = r1
                    goto L75
                L1f:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L27:
                    java.lang.Object r1 = r11.f434935b
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    java.lang.Object r3 = r11.f434934a
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r3 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e) r3
                    kotlin.C42729a0.b(r12)
                    goto L5b
                L33:
                    kotlin.C42729a0.b(r12)
                    goto L45
                L37:
                    kotlin.C42729a0.b(r12)
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b r12 = r11.f434937d
                    r11.f434936c = r4
                    java.lang.Object r12 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.b(r12, r11)
                    if (r12 != r0) goto L45
                    return r0
                L45:
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r12 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e) r12
                    java.lang.Exception r1 = r11.f434938e
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b r4 = r11.f434937d
                    r11.f434934a = r12
                    r11.f434935b = r1
                    r11.f434936c = r3
                    java.lang.Object r3 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.c(r4, r11)
                    if (r3 != r0) goto L58
                    return r0
                L58:
                    r10 = r3
                    r3 = r12
                    r12 = r10
                L5b:
                    ru.cyberity.cbr.core.data.source.dynamic.c$c r12 = (ru.cyberity.cbr.core.data.source.dynamic.c.C12476c) r12
                    java.lang.String r12 = ru.cyberity.cbr.core.common.y.a(r1, r12)
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = r11.f434937d
                    r11.f434934a = r3
                    r11.f434935b = r12
                    r11.f434936c = r2
                    java.lang.String r2 = "sns_confirmation_code_action_resend"
                    java.lang.Object r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r1, r2, r11)
                    if (r1 != r0) goto L72
                    return r0
                L72:
                    r4 = r12
                    r12 = r1
                    r0 = r3
                L75:
                    r3 = r12
                    java.lang.String r3 = (java.lang.String) r3
                    ru.cyberity.cbr.core.data.source.applicant.remote.a0 r7 = r11.f434939f
                    r8 = 3
                    r9 = 0
                    r1 = 0
                    r2 = 0
                    r5 = 0
                    ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r12 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e.a(r0, r1, r2, r3, r4, r5, r7, r8, r9)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a0 a0Var, CharSequence charSequence, Continuation<? super h> continuation) {
            super(1, continuation);
            this.f434932c = a0Var;
            this.f434933d = charSequence;
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super G0> continuation) {
            return ((h) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return b.this.new h(this.f434932c, this.f434933d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String confirmationId;
            String id2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434930a;
            try {
                if (i12 == 0) {
                    C42729a0.b(obj);
                    N0 n02 = b.this.countDownTimerJob;
                    if (n02 != null) {
                        n02.c(null);
                    }
                    a0 a0Var = this.f434932c;
                    if (a0Var == null || (confirmationId = a0Var.getConfirmationId()) == null) {
                        return G0.f406611a;
                    }
                    ru.cyberity.cbr.core.data.model.g gVar = b.this.applicant;
                    if (gVar == null || (id2 = gVar.getId()) == null) {
                        return G0.f406611a;
                    }
                    ru.cyberity.cbr.core.data.source.applicant.b bVar = b.this.applicantRepository;
                    ru.cyberity.cbr.core.data.source.applicant.remote.a aVar = new ru.cyberity.cbr.core.data.source.applicant.remote.a(new ru.cyberity.cbr.core.data.source.applicant.remote.q(this.f434933d.toString()), (ru.cyberity.cbr.core.data.source.applicant.remote.n) null, 2, (C42822w) null);
                    this.f434930a = 1;
                    obj = bVar.a(id2, confirmationId, aVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                b.this.a((a0) obj);
            } catch (Exception e12) {
                b bVar2 = b.this;
                CBRViewModel.updateState$default(bVar2, false, new a(bVar2, e12, this.f434932c, null), 1, null);
            } catch (Throwable th2) {
                ru.cyberity.cbr.presentation.screen.preview.b.a(b.this, th2, null, 2, null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel", f = "CBREkycViewModel.kt", i = {0, 1}, l = {703, 704, 706}, m = "defaultAppDataState", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434940a;

        /* renamed from: b, reason: collision with root package name */
        Object f434941b;

        /* renamed from: c, reason: collision with root package name */
        Object f434942c;

        /* renamed from: d, reason: collision with root package name */
        Object f434943d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f434944e;

        /* renamed from: g, reason: collision with root package name */
        int f434946g;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434944e = obj;
            this.f434946g |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(this);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel", f = "CBREkycViewModel.kt", i = {0, 1}, l = {711, 712, 713}, m = "defaultOtpConfirmState", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434947a;

        /* renamed from: b, reason: collision with root package name */
        Object f434948b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434949c;

        /* renamed from: e, reason: collision with root package name */
        int f434951e;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434949c = obj;
            this.f434951e |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.b(this);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel", f = "CBREkycViewModel.kt", i = {0, 0, 0}, l = {745}, m = "formatSourceId", n = {"this", "item", "sourceName"}, s = {"L$0", "L$1", "L$2"})
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434952a;

        /* renamed from: b, reason: collision with root package name */
        Object f434953b;

        /* renamed from: c, reason: collision with root package name */
        Object f434954c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434955d;

        /* renamed from: f, reason: collision with root package name */
        int f434957f;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434955d = obj;
            this.f434957f |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a((String) null, (String) null, this);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel", f = "CBREkycViewModel.kt", i = {0, 0}, l = {723}, m = "getResendCodeText", n = {"seconds", "minutes"}, s = {"L$0", "J$0"})
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f434958a;

        /* renamed from: b, reason: collision with root package name */
        Object f434959b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f434960c;

        /* renamed from: e, reason: collision with root package name */
        int f434962e;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434960c = obj;
            this.f434962e |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(0L, this);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$handleOAuthConfirmResponse$1", f = "CBREkycViewModel.kt", i = {}, l = {617, 620}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434963a;

        /* renamed from: b, reason: collision with root package name */
        Object f434964b;

        /* renamed from: c, reason: collision with root package name */
        int f434965c;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
            return ((m) create(eVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new m(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            CharSequence charSequence;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434965c;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                this.f434965c = 1;
                obj = bVar.getString("sns_confirmation_result_ekyc_failure_title", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = (String) this.f434964b;
                    charSequence = (CharSequence) this.f434963a;
                    C42729a0.b(obj);
                    str = str2;
                    return new e.f(charSequence, null, str, (CharSequence) obj, true);
                }
                C42729a0.b(obj);
            }
            String str3 = (String) obj;
            if (str3 == null) {
                str3 = "Error";
            }
            charSequence = str3;
            String imageName = CBRIconHandler.CBRResultIcons.FAILURE.getImageName();
            b bVar2 = b.this;
            this.f434963a = charSequence;
            this.f434964b = imageName;
            this.f434965c = 2;
            Object string = bVar2.getString("sns_confirmation_result_action_tryAgain", this);
            if (string == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = imageName;
            obj = string;
            return new e.f(charSequence, null, str, (CharSequence) obj, true);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$handleOtpConfirmResponse$1", f = "CBREkycViewModel.kt", i = {}, l = {633, 635, 637}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434967a;

        /* renamed from: b, reason: collision with root package name */
        Object f434968b;

        /* renamed from: c, reason: collision with root package name */
        int f434969c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a0 f434971e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(a0 a0Var, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f434971e = a0Var;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
            return ((n) create(eVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new n(this.f434971e, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f434969c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L33
                if (r1 == r4) goto L2f
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r0 = r11.f434968b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r11.f434967a
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r1 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e) r1
                kotlin.C42729a0.b(r12)
                r4 = r0
                r0 = r1
                goto L6f
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L27:
                java.lang.Object r1 = r11.f434967a
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r1 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e) r1
                kotlin.C42729a0.b(r12)
                goto L55
            L2f:
                kotlin.C42729a0.b(r12)
                goto L41
            L33:
                kotlin.C42729a0.b(r12)
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r12 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this
                r11.f434969c = r4
                java.lang.Object r12 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.b(r12, r11)
                if (r12 != r0) goto L41
                return r0
            L41:
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r12 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e) r12
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this
                r11.f434967a = r12
                r11.f434969c = r3
                java.lang.String r3 = "sns_confirmation_code_isNotValid"
                java.lang.Object r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r1, r3, r11)
                if (r1 != r0) goto L52
                return r0
            L52:
                r10 = r1
                r1 = r12
                r12 = r10
            L55:
                java.lang.String r12 = (java.lang.String) r12
                if (r12 != 0) goto L5b
                java.lang.String r12 = "Unknown error"
            L5b:
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r3 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this
                r11.f434967a = r1
                r11.f434968b = r12
                r11.f434969c = r2
                java.lang.String r2 = "sns_confirmation_code_action_resend"
                java.lang.Object r2 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r3, r2, r11)
                if (r2 != r0) goto L6c
                return r0
            L6c:
                r4 = r12
                r0 = r1
                r12 = r2
            L6f:
                r3 = r12
                java.lang.String r3 = (java.lang.String) r3
                ru.cyberity.cbr.core.data.source.applicant.remote.a0 r7 = r11.f434971e
                r8 = 3
                r9 = 0
                r1 = 0
                r2 = 0
                r5 = 0
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r12 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e.a(r0, r1, r2, r3, r4, r5, r7, r8, r9)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/cyberity/cbr/presentation/screen/preview/ekyc/b$o", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "", "sectionId", "itemId", "valueFor", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class o implements ItemValueCache {
        public o() {
        }

        @Override // ru.cyberity.cbr.core.presentation.form.ItemValueCache
        @Y61.l
        public String valueFor(@Y61.k String sectionId, @Y61.k String itemId) {
            return (String) b.this.l().get(itemId);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel", f = "CBREkycViewModel.kt", i = {0, 0, 0}, l = {150}, m = "onDataLoaded", n = {"this", "applicant", Navigation.CONFIG}, s = {"L$0", "L$1", "L$2"})
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f434973a;

        /* renamed from: b, reason: collision with root package name */
        Object f434974b;

        /* renamed from: c, reason: collision with root package name */
        Object f434975c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f434976d;

        /* renamed from: f, reason: collision with root package name */
        int f434978f;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f434976d = obj;
            this.f434978f |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a((ru.cyberity.cbr.core.data.model.g) null, (ru.cyberity.cbr.core.data.model.e) null, this);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$onSubmitAppDataClick$1", f = "CBREkycViewModel.kt", i = {}, l = {398, 403, 403}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434979a;

        /* renamed from: b, reason: collision with root package name */
        Object f434980b;

        /* renamed from: c, reason: collision with root package name */
        int f434981c;

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "key", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        public static final class a extends N implements Y41.l<String, String> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f434983a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.f434983a = bVar;
            }

            @Override // Y41.l
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@Y61.l String str) {
                String str2 = (String) this.f434983a.l().get(str);
                return str2 == null ? "" : str2;
            }
        }

        public q(Continuation<? super q> continuation) {
            super(1, continuation);
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super G0> continuation) {
            return ((q) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return b.this.new q(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$requestOAuth$1", f = "CBREkycViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434984a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f434985b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f434986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, String str2, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f434985b = str;
            this.f434986c = str2;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
            return ((r) create(eVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new r(this.f434985b, this.f434986c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434984a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return new e.d(this.f434985b, this.f434986c);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$requestOtpConfirmation$1", f = "CBREkycViewModel.kt", i = {}, l = {676, 677}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434987a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f434988b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a0 f434990d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a0 a0Var, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f434990d = a0Var;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
            return ((s) create(eVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            s sVar = b.this.new s(this.f434990d, continuation);
            sVar.f434988b = obj;
            return sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            e.C12525e c12525e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f434987a;
            if (i12 == 0) {
                C42729a0.b(obj);
                e eVar = (e) this.f434988b;
                b bVar = b.this;
                this.f434987a = 1;
                obj = bVar.b(eVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c12525e = (e.C12525e) this.f434988b;
                    C42729a0.b(obj);
                    return e.C12525e.a(c12525e, null, null, (CharSequence) obj, null, 0L, this.f434990d, 27, null);
                }
                C42729a0.b(obj);
            }
            e.C12525e c12525e2 = (e.C12525e) obj;
            b bVar2 = b.this;
            this.f434988b = c12525e2;
            this.f434987a = 2;
            Object objA = bVar2.a(60L, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            c12525e = c12525e2;
            obj = objA;
            return e.C12525e.a(c12525e, null, null, (CharSequence) obj, null, 0L, this.f434990d, 27, null);
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "item", "name", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class t extends N implements Y41.p<String, String, String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f434991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f434992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f434993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.C12476c f434994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, b bVar, String str2, c.C12476c c12476c) {
            super(2);
            this.f434991a = str;
            this.f434992b = bVar;
            this.f434993c = str2;
            this.f434994d = c12476c;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@Y61.k String str, @Y61.l String str2) {
            String str3;
            ru.cyberity.cbr.core.data.model.e appConfig;
            Map<String, Map<String, String>> mapT;
            Map<String, String> map;
            ru.cyberity.cbr.core.data.model.e appConfig2;
            Map<String, ru.cyberity.cbr.core.data.model.u> mapX;
            ru.cyberity.cbr.core.data.model.u uVar;
            Map<String, String> mapC;
            String strA = x0.a(C43066x.e0(this.f434991a, new char[]{'.'}));
            ru.cyberity.cbr.domain.c cVar = this.f434992b.resources;
            String str4 = (cVar == null || (appConfig2 = cVar.getAppConfig()) == null || (mapX = appConfig2.x()) == null || (uVar = mapX.get(strA)) == null || (mapC = uVar.c()) == null) ? null : mapC.get(str2);
            ru.cyberity.cbr.domain.c cVar2 = this.f434992b.resources;
            if (cVar2 == null || (appConfig = cVar2.getAppConfig()) == null || (mapT = appConfig.t()) == null || (map = mapT.get(this.f434993c)) == null || (str3 = map.get(str2)) == null || !str.equals("field")) {
                str3 = null;
            }
            c.C12476c c12476c = this.f434994d;
            u0 u0Var = u0.f406856a;
            String strA2 = c12476c.a(String.format("sns_data_%s_%s", Arrays.copyOf(new Object[]{str, str2}, 2)));
            if (str4 != null) {
                if (!str.equals("field")) {
                    str4 = null;
                }
                if (str4 != null) {
                    return str4;
                }
            }
            if (str3 == null || !str.equals("field")) {
                str3 = null;
            }
            if (str3 != null) {
                return str3;
            }
            if (strA2 != null) {
                return strA2;
            }
            if (str2 == null || !str.equals("field")) {
                return null;
            }
            return str2;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$showContent$1", f = "CBREkycViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class u extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f434995a;

        public u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
            return ((u) create(eVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new u(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f434995a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return e.c.f434903a;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$skipStep$1", f = "CBREkycViewModel.kt", i = {}, l = {351, 355, 355}, m = "invokeSuspend", n = {}, s = {})
    public static final class v extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f434996a;

        /* renamed from: b, reason: collision with root package name */
        Object f434997b;

        /* renamed from: c, reason: collision with root package name */
        int f434998c;

        public v(Continuation<? super v> continuation) {
            super(1, continuation);
        }

        @Override // Y41.l
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.l Continuation<? super G0> continuation) {
            return ((v) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return b.this.new v(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[Catch: all -> 0x0033, Api -> 0x0035, TryCatch #2 {Api -> 0x0035, all -> 0x0033, blocks: (B:11:0x002f, B:25:0x0057, B:27:0x005b, B:29:0x005f, B:31:0x0065, B:18:0x003a, B:20:0x0042, B:22:0x0048), top: B:44:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f434998c
                r2 = 3
                r3 = 1
                r4 = 2
                r5 = 0
                if (r1 == 0) goto L37
                if (r1 == r3) goto L2f
                if (r1 == r4) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r0 = r6.f434997b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.Object r1 = r6.f434996a
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b) r1
                kotlin.C42729a0.b(r7)
                goto L9a
            L1f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L27:
                java.lang.Object r1 = r6.f434996a
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b) r1
                kotlin.C42729a0.b(r7)
                goto L85
            L2f:
                kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                goto L57
            L33:
                r7 = move-exception
                goto L69
            L35:
                r7 = move-exception
                goto L6f
            L37:
                kotlin.C42729a0.b(r7)
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r7 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                ru.cyberity.cbr.core.data.model.g r7 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r7)     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                if (r7 == 0) goto L5a
                java.lang.String r7 = r7.getId()     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                if (r7 == 0) goto L5a
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                ru.cyberity.cbr.core.data.source.applicant.b r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.b(r1)     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                r6.f434998c = r3     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                java.lang.Object r7 = r1.d(r7, r6)     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                if (r7 != r0) goto L57
                return r0
            L57:
                ru.cyberity.cbr.core.data.source.applicant.remote.z r7 = (ru.cyberity.cbr.core.data.source.applicant.remote.z) r7     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                goto L5b
            L5a:
                r7 = r5
            L5b:
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                if (r7 == 0) goto L64
                ru.cyberity.cbr.core.data.source.applicant.remote.EKycFlowStatus r7 = r7.getStatus()     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                goto L65
            L64:
                r7 = r5
            L65:
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r1, r7)     // Catch: java.lang.Throwable -> L33 ru.cyberity.cbr.core.data.model.CBRException.Api -> L35
                goto La4
            L69:
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r0 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this
                ru.cyberity.cbr.presentation.screen.preview.b.a(r0, r7, r5, r4, r5)
                goto La4
            L6f:
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this
                java.lang.String r3 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e(r1)
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r1, r3, r5, r4, r5)
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r1 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this
                r6.f434996a = r1
                r6.f434998c = r4
                java.lang.Object r7 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r1, r7, r6)
                if (r7 != r0) goto L85
                return r0
            L85:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b r3 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.this
                r6.f434996a = r1
                r6.f434997b = r7
                r6.f434998c = r2
                java.lang.String r2 = "sns_alert_action_dismiss"
                java.lang.Object r2 = ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r3, r2, r6)
                if (r2 != r0) goto L98
                return r0
            L98:
                r0 = r7
                r7 = r2
            L9a:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b$d r2 = new ru.cyberity.cbr.presentation.screen.preview.ekyc.b$d
                r2.<init>(r0, r7)
                ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(r1, r2)
            La4:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$startResendCodeTimer$1", f = "CBREkycViewModel.kt", i = {}, l = {663}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435000a;

        /* renamed from: b, reason: collision with root package name */
        Object f435001b;

        /* renamed from: c, reason: collision with root package name */
        int f435002c;

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$startResendCodeTimer$1$1$1", f = "CBREkycViewModel.kt", i = {}, l = {658, 660}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435004a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f435005b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f435006c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f435007d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, long j12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f435006c = bVar;
                this.f435007d = j12;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f435006c, this.f435007d, continuation);
                aVar.f435005b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                e.C12525e c12525e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f435004a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    e eVar = (e) this.f435005b;
                    b bVar = this.f435006c;
                    this.f435004a = 1;
                    obj = bVar.b(eVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c12525e = (e.C12525e) this.f435005b;
                        C42729a0.b(obj);
                        return e.C12525e.a(c12525e, null, null, (CharSequence) obj, null, this.f435007d, null, 43, null);
                    }
                    C42729a0.b(obj);
                }
                e.C12525e c12525e2 = (e.C12525e) obj;
                b bVar2 = this.f435006c;
                long j12 = this.f435007d;
                this.f435005b = c12525e2;
                this.f435004a = 2;
                Object objA = bVar2.a(j12, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c12525e = c12525e2;
                obj = objA;
                return e.C12525e.a(c12525e, null, null, (CharSequence) obj, null, this.f435007d, null, 43, null);
            }
        }

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$startResendCodeTimer$1$2", f = "CBREkycViewModel.kt", i = {}, l = {667, 668}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.presentation.screen.preview.ekyc.b$w$b, reason: collision with other inner class name */
        public static final class C12526b extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f435008a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f435009b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f435010c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12526b(b bVar, Continuation<? super C12526b> continuation) {
                super(2, continuation);
                this.f435010c = bVar;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
                return ((C12526b) create(eVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C12526b c12526b = new C12526b(this.f435010c, continuation);
                c12526b.f435009b = obj;
                return c12526b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                e.C12525e c12525e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f435008a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    e eVar = (e) this.f435009b;
                    b bVar = this.f435010c;
                    this.f435008a = 1;
                    obj = bVar.b(eVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c12525e = (e.C12525e) this.f435009b;
                        C42729a0.b(obj);
                        return e.C12525e.a(c12525e, null, null, (CharSequence) obj, null, 0L, null, 59, null);
                    }
                    C42729a0.b(obj);
                }
                e.C12525e c12525e2 = (e.C12525e) obj;
                b bVar2 = this.f435010c;
                this.f435009b = c12525e2;
                this.f435008a = 2;
                Object string = bVar2.getString("sns_confirmation_code_action_resend", this);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c12525e = c12525e2;
                obj = string;
                return e.C12525e.a(c12525e, null, null, (CharSequence) obj, null, 0L, null, 59, null);
            }
        }

        public w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((w) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new w(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            b bVar;
            Iterator<Long> it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f435002c;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlin.ranges.m.f406914e.getClass();
                kotlin.ranges.m mVar = new kotlin.ranges.m(60L, 0, -1L);
                bVar = b.this;
                it = mVar.iterator();
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f435001b;
                bVar = (b) this.f435000a;
                C42729a0.b(obj);
            }
            while (it.hasNext()) {
                CBRViewModel.updateState$default(bVar, false, new a(bVar, ((L0) it).a(), null), 1, null);
                this.f435000a = bVar;
                this.f435001b = it;
                this.f435002c = 1;
                if (C43131e0.b(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            b bVar2 = b.this;
            CBRViewModel.updateState$default(bVar2, false, new C12526b(bVar2, null), 1, null);
            return G0.f406611a;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$updateCountry$1", f = "CBREkycViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f435011a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f435013c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<ru.cyberity.cbr.domain.b> f435014d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str, List<ru.cyberity.cbr.domain.b> list, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f435013c = str;
            this.f435014d = list;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((x) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return b.this.new x(this.f435013c, this.f435014d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            ru.cyberity.cbr.core.data.model.j jVar;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f435011a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            Logger.i$default(ru.cyberity.log.a.f436064a, "EKyc", "Update country, oldCountry=" + b.this.d() + ", newCountry=" + this.f435013c + ", errors=" + this.f435014d.size(), null, 4, null);
            boolean zF2 = L.f(b.this.d(), this.f435013c);
            b.this.a(this.f435013c);
            ru.cyberity.cbr.core.data.model.e config = b.this.getConfig();
            String sourceId = null;
            Map<String, List<ru.cyberity.cbr.core.data.model.j>> mapW = config != null ? config.w() : null;
            List<ru.cyberity.cbr.core.data.model.j> list = mapW != null ? mapW.get(this.f435013c) : null;
            if (zF2 && (str = b.this.currentSourceId) != null && !C43066x.K(str)) {
                sourceId = b.this.currentSourceId;
            } else if (list != null && (jVar = (ru.cyberity.cbr.core.data.model.j) C42745f0.K(0, list)) != null) {
                sourceId = jVar.getSourceId();
            }
            b.this.b(sourceId, this.f435014d);
            return G0.f406611a;
        }
    }

    /* compiled from: CBREkycViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$updateSource$1", f = "CBREkycViewModel.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {202, 210, 229, 234, 244}, m = "invokeSuspend", n = {"sources", "formItems", "sources", "formItems", "strings", "fieldValueCache", "sources", "formItems", "strings", "fieldValueCache", "sources", "formItems", "strings", "fieldValueCache", "destination$iv$iv", "it", "sources", "formItems", "strings", "fieldValueCache"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$7", "L$0", "L$1", "L$2", "L$3"})
    public static final class y extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f435015a;

        /* renamed from: b, reason: collision with root package name */
        Object f435016b;

        /* renamed from: c, reason: collision with root package name */
        Object f435017c;

        /* renamed from: d, reason: collision with root package name */
        Object f435018d;

        /* renamed from: e, reason: collision with root package name */
        Object f435019e;

        /* renamed from: f, reason: collision with root package name */
        Object f435020f;

        /* renamed from: g, reason: collision with root package name */
        Object f435021g;

        /* renamed from: h, reason: collision with root package name */
        Object f435022h;

        /* renamed from: i, reason: collision with root package name */
        Object f435023i;

        /* renamed from: j, reason: collision with root package name */
        Object f435024j;

        /* renamed from: k, reason: collision with root package name */
        Object f435025k;

        /* renamed from: l, reason: collision with root package name */
        int f435026l;

        /* renamed from: m, reason: collision with root package name */
        int f435027m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f435028n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ b f435029o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<ru.cyberity.cbr.domain.b> f435030p;

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/ekyc/b$e;", "it", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.presentation.screen.preview.ekyc.CBREkycViewModel$updateSource$1$12", f = "CBREkycViewModel.kt", i = {}, l = {281, 285}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<e, Continuation<? super e>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f435031a;

            /* renamed from: b, reason: collision with root package name */
            int f435032b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f435033c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f435034d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f435035e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ArrayList<FormItem> f435036f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, String str, ArrayList<FormItem> arrayList, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f435034d = bVar;
                this.f435035e = str;
                this.f435036f = arrayList;
            }

            @Override // Y41.p
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Y61.k e eVar, @Y61.l Continuation<? super e> continuation) {
                return ((a) create(eVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f435034d, this.f435035e, this.f435036f, continuation);
                aVar.f435033c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                String str;
                e.a aVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f435032b;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    e eVar = (e) this.f435033c;
                    b bVar = this.f435034d;
                    this.f435032b = 1;
                    obj = bVar.a(eVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str2 = (String) this.f435031a;
                        e.a aVar2 = (e.a) this.f435033c;
                        C42729a0.b(obj);
                        str = str2;
                        aVar = aVar2;
                        return e.a.a(aVar, null, null, (String) obj, null, null, str, this.f435035e, this.f435036f, 27, null);
                    }
                    C42729a0.b(obj);
                }
                e.a aVar3 = (e.a) obj;
                String strD = this.f435034d.d();
                b bVar2 = this.f435034d;
                this.f435033c = aVar3;
                this.f435031a = strD;
                this.f435032b = 2;
                Object string = bVar2.getString("sns_ekyc_action_continue", this);
                if (string == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strD;
                aVar = aVar3;
                obj = string;
                return e.a.a(aVar, null, null, (String) obj, null, null, str, this.f435035e, this.f435036f, 27, null);
            }
        }

        /* compiled from: CBREkycViewModel.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/core/data/model/FieldName;", "fieldName", "", "a", "(Lru/cyberity/cbr/core/data/model/FieldName;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.presentation.screen.preview.ekyc.b$y$b, reason: collision with other inner class name */
        public static final class C12527b extends N implements Y41.l<FieldName, String> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f435037a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12527b(b bVar) {
                super(1);
                this.f435037a = bVar;
            }

            @Override // Y41.l
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@Y61.k FieldName fieldName) {
                return (String) this.f435037a.l().get(fieldName.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(String str, b bVar, List<ru.cyberity.cbr.domain.b> list, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f435028n = str;
            this.f435029o = bVar;
            this.f435030p = list;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super G0> continuation) {
            return ((y) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new y(this.f435028n, this.f435029o, this.f435030p, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x034e  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0370  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0399  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x041a  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0263 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x028c  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02e6  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0322 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0323  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x033b  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x033e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x02c9 -> B:77:0x02cb). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r33) {
            /*
                Method dump skipped, instructions count: 1059
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(@Y61.k Document document, @Y61.k ru.cyberity.cbr.core.data.source.extensions.a aVar, @Y61.k ru.cyberity.cbr.core.data.source.applicant.b bVar, @Y61.k C23060r0 c23060r0, @Y61.k ru.cyberity.cbr.core.data.source.common.a aVar2, @Y61.k ru.cyberity.cbr.core.data.source.dynamic.c cVar, @Y61.k ru.cyberity.cbr.core.domain.b bVar2) {
        super(document, c23060r0, aVar2, cVar, bVar2);
        this.extensionProvider = aVar;
        this.applicantRepository = bVar;
        this.tinValidator = new y0();
        this.timerScope = U.a(new C43315z0(Executors.newSingleThreadExecutor()));
        this.itemValueCache = new o();
        this._formViewState = p2.a(new HostViewModel.FormViewState(0, C42784z0.f406748b, null, new HostViewModel.ValidationStrings(null, null, 3, null)));
        this.fieldValueCache = new ru.cyberity.cbr.core.presentation.screen.base.a(c23060r0, "KEY_FIELD_CACHE", P0.c());
        j0.b(getViewState(), androidx.view.N0.a(this), new a(null));
    }

    private final N0 p() {
        return a(this, d(), (List) null, 2, (Object) null);
    }

    private final void r() {
        N0 n02 = this.countDownTimerJob;
        if (n02 != null) {
            n02.c(null);
        }
        this.countDownTimerJob = C43259k.d(this.timerScope, null, null, new w(null), 3);
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

    public final void m() {
        Logger.v$default(ru.cyberity.log.a.f436064a, "EKyc", "onCloseOAuthClick", null, 4, null);
        p();
    }

    public final void n() {
        a((Y41.l<? super Continuation<? super G0>, ? extends Object>) new q(null));
    }

    public final void o() {
        Logger.v$default(ru.cyberity.log.a.f436064a, "EKyc", "onTryAgainClick", null, 4, null);
        p();
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel, androidx.view.M0
    public void onCleared() {
        super.onCleared();
        U.b(this.timerScope, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.form.HostViewModel
    public void onFieldValueChanged(@Y61.k FormItem field, @Y61.l String value) {
        Logger.d$default(ru.cyberity.log.a.f436064a, "EKyc", "onFieldValueChanged: " + field.toShortString() + " -> " + value, null, 4, null);
        Map<String, String> mapL = l();
        String id2 = field.getItem().getId();
        if (id2 == null) {
            id2 = "";
        }
        d(ru.cyberity.cbr.core.common.s.a(mapL, id2, value));
        if (field instanceof FormItem.CountrySelect) {
            a(this, value, (List) null, 2, (Object) null);
        } else if (L.f(field.getItem().getId(), "source_id")) {
            b(this, value, null, 2, null);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.l
    public Object onPrepare(@Y61.k Continuation<? super G0> continuation) {
        onLoad();
        return G0.f406611a;
    }

    public final void q() {
        a((Y41.l<? super Continuation<? super G0>, ? extends Object>) new v(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Map<String, String> map) {
        this.fieldValueCache.a(this, f434872B[0], map);
    }

    private final void e(a0 response) {
        ru.cyberity.cbr.core.data.source.applicant.remote.m oAuthConfirmation = response.getOAuthConfirmation();
        String redirectUrl = oAuthConfirmation != null ? oAuthConfirmation.getRedirectUrl() : null;
        ru.cyberity.cbr.core.data.source.applicant.remote.m oAuthConfirmation2 = response.getOAuthConfirmation();
        String str = oAuthConfirmation2 != null ? oAuthConfirmation2.getCom.avito.android.remote.model.messenger.context_actions.ContextActionHandler.Link.URL java.lang.String() : null;
        if (str == null || str.length() == 0 || redirectUrl == null || redirectUrl.length() == 0) {
            ru.cyberity.cbr.presentation.screen.preview.b.a(this, new Exception("url or redirect url is empty"), null, 2, null);
        } else {
            CBRViewModel.updateState$default(this, false, new r(str, redirectUrl, null), 1, null);
        }
    }

    private final void f(a0 response) {
        CBRViewModel.updateState$default(this, false, new s(response, null), 1, null);
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> l() {
        return (Map) this.fieldValueCache.a(this, f434872B[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j() {
        N0 n02 = this.countDownTimerJob;
        if (n02 != null) {
            n02.c(null);
        }
        e eVar = (e) currentState();
        if (!(eVar instanceof e.d ? true : eVar instanceof e.C12525e)) {
            return true;
        }
        p();
        return false;
    }

    @Override // ru.cyberity.cbr.core.presentation.base.CBRViewModel
    @Y61.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e.C12524b getDefaultState() {
        return e.C12524b.f434902a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(a0 response) {
        if (response == null) {
            return;
        }
        if (response.getStatus() == EKycFlowStatus.CONFIRMATION_REQUIRED) {
            this.currentConfirmationId = response.getConfirmationId();
            ConfirmationType confirmationType = response.getConfirmationType();
            int i12 = confirmationType == null ? -1 : f.f434917a[confirmationType.ordinal()];
            if (i12 == 1) {
                f(response);
                return;
            } else if (i12 != 2) {
                a(response.getStatus());
                return;
            } else {
                e(response);
                return;
            }
        }
        a(response.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.core.data.source.applicant.remote.b c(Map<String, String> info) {
        Map<String, List<ru.cyberity.cbr.core.data.model.j>> mapW;
        Object next;
        ru.cyberity.cbr.core.data.model.e config = getConfig();
        if (config != null && (mapW = config.w()) != null) {
            String strD = d();
            if (strD != null) {
                List<ru.cyberity.cbr.core.data.model.j> list = mapW.get(strD);
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (L.f(((ru.cyberity.cbr.core.data.model.j) next).getSourceId(), this.currentSourceId)) {
                            break;
                        }
                    }
                    ru.cyberity.cbr.core.data.model.j jVar = (ru.cyberity.cbr.core.data.model.j) next;
                    if (jVar != null) {
                        if (L.f(jVar.getDocType(), "TAX_PAYER_NUMBER_DOC")) {
                            return new ru.cyberity.cbr.core.data.source.applicant.remote.b((Map) null, info, 1, (C42822w) null);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(info);
                        String docType = jVar.getDocType();
                        if (docType != null) {
                            linkedHashMap.put("idDocType", docType);
                        }
                        return new ru.cyberity.cbr.core.data.source.applicant.remote.b(linkedHashMap, (Map) null, 2, (C42822w) null);
                    }
                }
                throw new IllegalArgumentException("ApplicantDataSource is null");
            }
            throw new IllegalArgumentException("country is null");
        }
        throw new IllegalArgumentException("eKycConfig is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N0 b(String sourceId, List<ru.cyberity.cbr.domain.b> fieldsErrors) {
        return C43259k.d(androidx.view.N0.a(this), null, null, new y(sourceId, this, fieldsErrors, null), 3);
    }

    private final void b(a0 response) {
        if (response.getStatus() == EKycFlowStatus.CONFIRMATION_REQUIRED && response.getConfirmationStatus() == ConfirmationStatus.RETRY) {
            showProgress(false);
            a(true);
            CBRViewModel.updateState$default(this, false, new m(null), 1, null);
            return;
        }
        a(response.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(e eVar, Continuation<? super e.C12525e> continuation) {
        e.C12525e c12525e = eVar instanceof e.C12525e ? (e.C12525e) eVar : null;
        return c12525e == null ? b(continuation) : c12525e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.C12525e> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ru.cyberity.cbr.presentation.screen.preview.ekyc.b.j
            if (r0 == 0) goto L13
            r0 = r12
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b$j r0 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.j) r0
            int r1 = r0.f434951e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434951e = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b$j r0 = new ru.cyberity.cbr.presentation.screen.preview.ekyc.b$j
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f434949c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f434951e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r1 = r0.f434948b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f434947a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.C42729a0.b(r12)
            r3 = r0
            goto L8e
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L40:
            java.lang.Object r2 = r0.f434948b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.Object r4 = r0.f434947a
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b r4 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b) r4
            kotlin.C42729a0.b(r12)
            goto L7a
        L4c:
            java.lang.Object r2 = r0.f434947a
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b r2 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b) r2
            kotlin.C42729a0.b(r12)
            goto L65
        L54:
            kotlin.C42729a0.b(r12)
            r0.f434947a = r11
            r0.f434951e = r5
            r5 = 60
            java.lang.Object r12 = r11.a(r5, r0)
            if (r12 != r1) goto L64
            return r1
        L64:
            r2 = r11
        L65:
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r0.f434947a = r2
            r0.f434948b = r12
            r0.f434951e = r4
            java.lang.String r4 = "sns_confirmation_code_ekyc_title"
            java.lang.Object r4 = r2.getString(r4, r0)
            if (r4 != r1) goto L76
            return r1
        L76:
            r10 = r2
            r2 = r12
            r12 = r4
            r4 = r10
        L7a:
            java.lang.String r12 = (java.lang.String) r12
            r0.f434947a = r2
            r0.f434948b = r12
            r0.f434951e = r3
            java.lang.String r3 = "sns_confirmation_code_ekyc_subtitle"
            java.lang.Object r0 = r4.getString(r3, r0)
            if (r0 != r1) goto L8b
            return r1
        L8b:
            r1 = r12
            r12 = r0
            r3 = r2
        L8e:
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e r12 = new ru.cyberity.cbr.presentation.screen.preview.ekyc.b$e$e
            r8 = 40
            r9 = 0
            r4 = 0
            r5 = 60
            r7 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void c(a0 response) {
        if (response.getConfirmationStatus() == ConfirmationStatus.RETRY) {
            CBRViewModel.updateState$default(this, false, new n(response, null), 1, null);
        } else {
            f(response);
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    public void a(@Y61.k ru.cyberity.cbr.core.domain.c countriesResultData) {
        String strD = d();
        if (strD == null) {
            strD = countriesResultData.getCurrentCountryKey();
        }
        a(strD);
        a(countriesResultData.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@Y61.l ru.cyberity.cbr.core.data.model.g r21, @Y61.l ru.cyberity.cbr.core.data.model.e r22, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r23) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(ru.cyberity.cbr.core.data.model.g, ru.cyberity.cbr.core.data.model.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static N0 b(b bVar, String str, List list, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            list = C42784z0.f406748b;
        }
        return bVar.b(str, (List<ru.cyberity.cbr.domain.b>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static N0 a(b bVar, String str, List list, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            list = C42784z0.f406748b;
        }
        return bVar.a(str, (List<ru.cyberity.cbr.domain.b>) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ru.cyberity.cbr.domain.b a(List<ru.cyberity.cbr.domain.b> list, FieldName fieldName) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ru.cyberity.cbr.core.data.model.h field = ((ru.cyberity.cbr.domain.b) next).getField();
            if ((field instanceof h.d) && ((h.d) field).getName() == fieldName) {
                break;
            }
        }
        return (ru.cyberity.cbr.domain.b) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y41.p<String, String, String> a(c.C12476c strings, String country, String sourceId) {
        return new t(sourceId, this, country, strings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N0 a(String country, List<ru.cyberity.cbr.domain.b> fieldsErrors) {
        return C43259k.d(androidx.view.N0.a(this), null, null, new x(country, fieldsErrors, null), 3);
    }

    private final void a(CharSequence code, a0 submitResponse) {
        a((Y41.l<? super Continuation<? super G0>, ? extends Object>) new h(submitResponse, code, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@Y61.l CharSequence code) {
        a0 submitResponse;
        ru.cyberity.cbr.core.data.source.applicant.remote.p otpConfirmation;
        if (code == null) {
            return;
        }
        S sCurrentState = currentState();
        e.C12525e c12525e = sCurrentState instanceof e.C12525e ? (e.C12525e) sCurrentState : null;
        if (c12525e == null || (submitResponse = c12525e.getSubmitResponse()) == null || (otpConfirmation = submitResponse.getOtpConfirmation()) == null) {
            return;
        }
        int length = code.length();
        Integer codeLength = otpConfirmation.getCodeLength();
        if (codeLength != null && length == codeLength.intValue()) {
            N0 n02 = this.countDownTimerJob;
            if (n02 != null) {
                n02.c(null);
            }
            a(code, c12525e.getSubmitResponse());
        }
    }

    public final boolean a(@Y61.k Uri url, @Y61.l String aCallbackUrl) {
        String id2;
        String str;
        Logger.d$default(ru.cyberity.log.a.f436064a, "EKyc", androidx.appcompat.app.r.n(url, "onCallbackUrl: "), null, 4, null);
        if (aCallbackUrl == null || aCallbackUrl.length() == 0 || !C43066x.h0(url.toString(), aCallbackUrl, false)) {
            return false;
        }
        showProgress(true);
        a(false);
        ru.cyberity.cbr.core.data.model.g gVar = this.applicant;
        if (gVar == null || (id2 = gVar.getId()) == null || (str = this.currentConfirmationId) == null) {
            return true;
        }
        ru.cyberity.cbr.core.data.source.applicant.remote.a aVar = new ru.cyberity.cbr.core.data.source.applicant.remote.a((ru.cyberity.cbr.core.data.source.applicant.remote.q) null, new ru.cyberity.cbr.core.data.source.applicant.remote.n(url.toString()), 1, (C42822w) null);
        this.lastOAuthConfirmModel = aVar;
        a(id2, str, aVar);
        return true;
    }

    private final void a(String applicantId, String confirmationId, ru.cyberity.cbr.core.data.source.applicant.remote.a data) {
        showProgress(true);
        a(false);
        C43259k.d(androidx.view.N0.a(this), null, null, new g(applicantId, confirmationId, data, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(a0 response) {
        if (response == null) {
            return;
        }
        if (response.getStatus() == EKycFlowStatus.CONFIRMATION_REQUIRED) {
            ConfirmationType confirmationType = response.getConfirmationType();
            int i12 = confirmationType == null ? -1 : f.f434917a[confirmationType.ordinal()];
            if (i12 == 1) {
                c(response);
                return;
            } else if (i12 != 2) {
                a(response.getStatus());
                return;
            } else {
                b(response);
                return;
            }
        }
        a(response.getStatus());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(EKycFlowStatus status) {
        int i12 = status == null ? -1 : f.f434918b[status.ordinal()];
        if (i12 == 1 || i12 == 2) {
            CBRViewModel.finish$default(this, new a0.b(false, 1, null), null, null, 6, null);
        } else if (i12 != 3) {
            CBRViewModel.finish$default(this, new a0.b(false), null, null, 6, null);
        } else {
            CBRViewModel.finish$default(this, new a0.b(false), null, null, 6, null);
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.b
    public void a(boolean show) {
        if (show) {
            return;
        }
        CBRViewModel.updateState$default(this, false, new u(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(e eVar, Continuation<? super e.a> continuation) {
        e.a aVar = eVar instanceof e.a ? (e.a) eVar : null;
        return aVar == null ? a(continuation) : aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super ru.cyberity.cbr.presentation.screen.preview.ekyc.b.e.a> r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r9, kotlin.coroutines.Continuation<? super java.lang.CharSequence> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ru.cyberity.cbr.presentation.screen.preview.ekyc.b.l
            if (r0 == 0) goto L13
            r0 = r11
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b$l r0 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.l) r0
            int r1 = r0.f434962e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f434962e = r1
            goto L18
        L13:
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b$l r0 = new ru.cyberity.cbr.presentation.screen.preview.ekyc.b$l
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f434960c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f434962e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r9 = r0.f434958a
            java.lang.Object r0 = r0.f434959b
            java.lang.String r0 = (java.lang.String) r0
            kotlin.C42729a0.b(r11)
            goto L6c
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.C42729a0.b(r11)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            long r4 = r11.toMinutes(r9)
            kotlin.jvm.internal.u0 r11 = kotlin.jvm.internal.u0.f406856a
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            long r6 = r11.toSeconds(r4)
            long r9 = r9 - r6
            java.lang.Long r9 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r3)
            java.lang.String r10 = "%02d"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r0.f434959b = r9
            r0.f434958a = r4
            r0.f434962e = r3
            java.lang.String r10 = "sns_confirmation_code_resendCountdown"
            java.lang.Object r11 = r8.getString(r10, r0)
            if (r11 != r1) goto L6a
            return r1
        L6a:
            r0 = r9
            r9 = r4
        L6c:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r9 = 58
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r10 = 0
            java.lang.String r0 = "{time}"
            java.lang.String r9 = kotlin.text.C43066x.a0(r11, r0, r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(CBRException.Api api, Continuation<? super String> continuation) {
        String description;
        if (api.getErrorCode() != null && (description = api.getDescription()) != null && !C43066x.K(description)) {
            return api.getDescription();
        }
        return getString("sns_ekyc_error_common", continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, kotlin.coroutines.Continuation<? super java.lang.String> r10) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r10 instanceof ru.cyberity.cbr.presentation.screen.preview.ekyc.b.k
            if (r1 == 0) goto L14
            r1 = r10
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b$k r1 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b.k) r1
            int r2 = r1.f434957f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f434957f = r2
            goto L19
        L14:
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b$k r1 = new ru.cyberity.cbr.presentation.screen.preview.ekyc.b$k
            r1.<init>(r10)
        L19:
            java.lang.Object r10 = r1.f434955d
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.f434957f
            r4 = 0
            if (r3 == 0) goto L3e
            if (r3 != r0) goto L36
            java.lang.Object r8 = r1.f434954c
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.f434953b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r1.f434952a
            ru.cyberity.cbr.presentation.screen.preview.ekyc.b r0 = (ru.cyberity.cbr.presentation.screen.preview.ekyc.b) r0
            kotlin.C42729a0.b(r10)
            goto L7a
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            kotlin.C42729a0.b(r10)
            if (r8 == 0) goto Lb0
            if (r9 != 0) goto L47
            goto Lb0
        L47:
            char[] r10 = new char[r0]
            r3 = 46
            r5 = 0
            r10[r5] = r3
            java.util.List r9 = kotlin.text.C43066x.e0(r9, r10)
            java.lang.String r9 = ru.cyberity.cbr.core.common.x0.a(r9)
            kotlin.jvm.internal.u0 r10 = kotlin.jvm.internal.u0.f406856a
            java.lang.Object[] r10 = new java.lang.Object[]{r8, r9}
            r3 = 2
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r3)
            java.lang.String r3 = "sns_ekyc_source_%s::%s"
            java.lang.String r10 = java.lang.String.format(r3, r10)
            r1.f434952a = r7
            r1.f434953b = r8
            r1.f434954c = r9
            r1.f434957f = r0
            java.lang.Object r10 = r7.getString(r10, r1)
            if (r10 != r2) goto L76
            return r2
        L76:
            r0 = r7
            r6 = r9
            r9 = r8
            r8 = r6
        L7a:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L8b
            int r1 = r10.length()
            if (r1 <= 0) goto L85
            goto L86
        L85:
            r10 = r4
        L86:
            if (r10 != 0) goto L89
            goto L8b
        L89:
            r4 = r10
            goto Lb0
        L8b:
            ru.cyberity.cbr.domain.c r10 = r0.resources
            if (r10 == 0) goto Lb0
            ru.cyberity.cbr.core.data.model.e r10 = r10.getAppConfig()
            if (r10 == 0) goto Lb0
            java.util.Map r10 = r10.x()
            if (r10 == 0) goto Lb0
            java.lang.Object r8 = r10.get(r8)
            ru.cyberity.cbr.core.data.model.u r8 = (ru.cyberity.cbr.core.data.model.u) r8
            if (r8 == 0) goto Lb0
            java.util.Map r8 = r8.e()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r8.get(r9)
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.screen.preview.ekyc.b.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
