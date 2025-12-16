package com.avito.android.user_stats.extended_user_stats;

import android.content.res.Resources;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.user_stats.extended_user_stats.ConfigInternalAction;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel;
import com.avito.android.user_stats.generated.api.api_3_sellers_private_statistics_general_config_post.OkRespDataResultMetricGroupingsItemSort;
import com.avito.user_stats.model.extended_user_stats.GroupingSearch;
import com.avito.user_stats.model.extended_user_stats.GroupingSort;
import com.avito.user_stats.model.extended_user_stats.ItemValueStats;
import com.avito.user_stats.model.extended_user_stats.MetricBadge;
import com.avito.user_stats.model.extended_user_stats.MetricGrouping;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedUserStatsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel$loadConfigV3$1", f = "ExtendedUserStatsViewModel.kt", i = {}, l = {654}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class E extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f317010q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ExtendedUserStatsViewModel f317011r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f317012s;

    /* compiled from: ExtendedUserStatsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction;", "action", "Lkotlin/G0;", "emit", "(Lcom/avito/android/user_stats/extended_user_stats/ConfigInternalAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExtendedUserStatsViewModel f317013b;

        public a(ExtendedUserStatsViewModel extendedUserStatsViewModel) {
            this.f317013b = extendedUserStatsViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v11, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r14v12, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v13, types: [java.util.ArrayList] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
            ExtendedUserStatsViewModel.c cVarNe;
            fW0.m mVar;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            GroupingSort groupingSort;
            MetricGrouping metricGrouping;
            Boolean visible;
            String name;
            ?? arrayList8;
            ArrayList arrayList9;
            ConfigInternalAction configInternalAction = (ConfigInternalAction) obj;
            ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317013b;
            String strB = C35729a.b(extendedUserStatsViewModel.f317060Y, extendedUserStatsViewModel.f317063b0, extendedUserStatsViewModel.f317065d0, extendedUserStatsViewModel.f317064c0);
            if (configInternalAction instanceof ConfigInternalAction.Loading) {
                extendedUserStatsViewModel.f317058W = true;
                cVarNe = ExtendedUserStatsViewModel.ne(extendedUserStatsViewModel, strB, ExtendedUserStatsViewModel.ConfigProgressState.f317083d);
            } else if (configInternalAction instanceof ConfigInternalAction.Content) {
                ZJ0.a aVar = ((ConfigInternalAction.Content) configInternalAction).f317003b;
                ZJ0.f features = aVar.getFeatures();
                fW0.r rVar = new fW0.r(Boolean.TRUE, Boolean.valueOf(features.getPlatformSpendings()), Boolean.valueOf(features.getPlatformDynamics()), features.getPlatformDynamicsABGroup());
                List<ZJ0.m> listB = aVar.b();
                ArrayList arrayList10 = new ArrayList();
                for (ZJ0.m mVar2 : listB) {
                    fW0.o oVarB = mVar2 != null ? C35730b.b(mVar2) : null;
                    if (oVarB != null) {
                        arrayList10.add(oVarB);
                    }
                }
                List<ZJ0.m> listF = aVar.f();
                ArrayList arrayList11 = new ArrayList();
                for (ZJ0.m mVar3 : listF) {
                    fW0.o oVarB2 = mVar3 != null ? C35730b.b(mVar3) : null;
                    if (oVarB2 != null) {
                        arrayList11.add(oVarB2);
                    }
                }
                ZJ0.e employees = aVar.getEmployees();
                int i12 = 10;
                if (employees != null) {
                    List<ZJ0.l> listA = employees.a();
                    if (listA != null) {
                        List<ZJ0.l> list = listA;
                        arrayList8 = new ArrayList(C42745f0.q(list, 10));
                        for (ZJ0.l lVar : list) {
                            arrayList8.add(new fW0.g(String.valueOf(lVar.getId()), lVar.getName(), null));
                        }
                    } else {
                        arrayList8 = C42784z0.f406748b;
                    }
                    List<Long> listB2 = employees.b();
                    if (listB2 != null) {
                        List<Long> list2 = listB2;
                        arrayList9 = new ArrayList(C42745f0.q(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList9.add(String.valueOf(((Number) it.next()).longValue()));
                        }
                    } else {
                        arrayList9 = null;
                    }
                    mVar = new fW0.m(arrayList8, arrayList9);
                } else {
                    mVar = null;
                }
                List<ZJ0.j> listJ = aVar.j();
                if (listJ != null) {
                    ArrayList arrayList12 = new ArrayList();
                    for (ZJ0.j jVar : listJ) {
                        String slug = jVar.getSlug();
                        fW0.x xVar = (slug == null || (name = jVar.getName()) == null) ? null : new fW0.x(slug, name, null, null, null, null, null);
                        if (xVar != null) {
                            arrayList12.add(xVar);
                        }
                    }
                    arrayList = arrayList12;
                } else {
                    arrayList = null;
                }
                List<ZJ0.n> listI = aVar.i();
                if (listI != null) {
                    ArrayList arrayList13 = new ArrayList();
                    for (ZJ0.n nVar : listI) {
                        String slug2 = nVar.getSlug();
                        String str = slug2 == null ? "" : slug2;
                        String name2 = nVar.getName();
                        arrayList13.add(new fW0.x(str, name2 == null ? "" : name2, null, nVar.getIsSelected(), null, nVar.getIsDisabled() != null ? Boolean.valueOf(!r8.booleanValue()) : null, null));
                    }
                    arrayList2 = arrayList13;
                } else {
                    arrayList2 = null;
                }
                List<ZJ0.i> listG = aVar.g();
                if (listG != null) {
                    ArrayList arrayList14 = new ArrayList();
                    Iterator<T> it2 = listG.iterator();
                    while (it2.hasNext()) {
                        List<ZJ0.o> listA2 = ((ZJ0.i) it2.next()).a();
                        ArrayList arrayList15 = new ArrayList(C42745f0.q(listA2, i12));
                        for (ZJ0.o oVar : listA2) {
                            arrayList15.add(new fW0.x(oVar.getSlug(), oVar.getName(), oVar.getShortName(), oVar.getIsSelected(), oVar.getIsVisible(), oVar.getIsEnabled(), oVar.a()));
                        }
                        C42745f0.h(arrayList15, arrayList14);
                        i12 = 10;
                    }
                    arrayList3 = arrayList14;
                } else {
                    arrayList3 = null;
                }
                String startCalendar = aVar.getStartCalendar();
                Date dateA = startCalendar != null ? C35730b.a(startCalendar) : new Date();
                List<ZJ0.b> listK = aVar.k();
                if (listK != null) {
                    ArrayList arrayList16 = new ArrayList();
                    for (ZJ0.b bVar : listK) {
                        String slug3 = bVar.getSlug();
                        if (slug3 == null) {
                            metricGrouping = null;
                        } else {
                            String title = bVar.getTitle();
                            String hint = bVar.getHint();
                            ZJ0.d search = bVar.getSearch();
                            GroupingSearch groupingSearch = search != null ? new GroupingSearch(search.getHint(), search.getPlaceholder()) : null;
                            OkRespDataResultMetricGroupingsItemSort sort = bVar.getSort();
                            if (sort != null) {
                                String metric = sort.getMetric();
                                OkRespDataResultMetricGroupingsItemSort.Order order = sort.getOrder();
                                groupingSort = new GroupingSort(metric, order != null ? order.f318298b : null);
                            } else {
                                groupingSort = null;
                            }
                            ZJ0.c badge = bVar.getBadge();
                            metricGrouping = new MetricGrouping(slug3, title, hint, groupingSearch, groupingSort, new MetricBadge((badge == null || (visible = badge.getVisible()) == null) ? false : visible.booleanValue()));
                        }
                        if (metricGrouping != null) {
                            arrayList16.add(metricGrouping);
                        }
                    }
                    arrayList4 = arrayList16;
                } else {
                    arrayList4 = null;
                }
                List<ZJ0.h> listE = aVar.e();
                if (listE != null) {
                    List<ZJ0.h> list3 = listE;
                    ArrayList arrayList17 = new ArrayList(C42745f0.q(list3, 10));
                    for (ZJ0.h hVar : list3) {
                        Image icon = hVar.getIcon();
                        Long id2 = hVar.getId();
                        arrayList17.add(new ItemValueStats(icon, id2 != null ? id2.toString() : null, hVar.getTitle()));
                    }
                    arrayList5 = arrayList17;
                } else {
                    arrayList5 = null;
                }
                List<ZJ0.k> listA3 = aVar.a();
                if (listA3 != null) {
                    ArrayList arrayList18 = new ArrayList();
                    for (ZJ0.k kVar : listA3) {
                        Action action = (kVar == null || kVar.getTitle() == null || kVar.getUri() == null) ? null : new Action(kVar.getTitle(), extendedUserStatsViewModel.f317052Q.b(kVar.getUri()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
                        if (action != null) {
                            arrayList18.add(action);
                        }
                    }
                    arrayList6 = arrayList18;
                } else {
                    arrayList6 = null;
                }
                List<String> listH = aVar.h();
                List<ZJ0.i> listG2 = aVar.g();
                if (listG2 != null) {
                    List<ZJ0.i> list4 = listG2;
                    ArrayList arrayList19 = new ArrayList(C42745f0.q(list4, 10));
                    Iterator<T> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        ZJ0.i iVar = (ZJ0.i) it3.next();
                        boolean isExpanded = iVar.getIsExpanded();
                        boolean isExtracted = iVar.getIsExtracted();
                        List<ZJ0.o> listA4 = iVar.a();
                        Iterator<T> it4 = it3;
                        ArrayList arrayList20 = new ArrayList(C42745f0.q(listA4, 10));
                        for (ZJ0.o oVar2 : listA4) {
                            arrayList20.add(new fW0.z(oVar2.a(), oVar2.getIsEnabled(), oVar2.getIsSelected(), oVar2.getIsVisible(), oVar2.getName(), oVar2.getShortName(), oVar2.getSlug()));
                        }
                        arrayList19.add(new fW0.k(isExpanded, isExtracted, arrayList20, iVar.getTitle()));
                        it3 = it4;
                    }
                    arrayList7 = arrayList19;
                } else {
                    arrayList7 = null;
                }
                extendedUserStatsViewModel.f317057V = new fW0.h(rVar, arrayList10, mVar, arrayList11, null, arrayList, arrayList2, arrayList3, dateA, arrayList4, arrayList5, arrayList6, listH, arrayList7);
                extendedUserStatsViewModel.f317058W = false;
                cVarNe = ExtendedUserStatsViewModel.ke(extendedUserStatsViewModel, strB);
            } else {
                if (!(configInternalAction instanceof ConfigInternalAction.ErrorConfig)) {
                    throw new NoWhenBranchMatchedException();
                }
                extendedUserStatsViewModel.f317058W = false;
                cVarNe = ExtendedUserStatsViewModel.ne(extendedUserStatsViewModel, strB, ExtendedUserStatsViewModel.ConfigProgressState.f317082c);
            }
            extendedUserStatsViewModel.f317055T.postValue(cVarNe);
            if (configInternalAction instanceof ConfigInternalAction.Content) {
                extendedUserStatsViewModel.ye(null);
                extendedUserStatsViewModel.ve(null);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(ExtendedUserStatsViewModel extendedUserStatsViewModel, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f317011r = extendedUserStatsViewModel;
        this.f317012s = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E(this.f317011r, this.f317012s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((E) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f317010q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ExtendedUserStatsViewModel extendedUserStatsViewModel = this.f317011r;
            InterfaceC43160i interfaceC43160iI = C43175k.I(C43262l0.f411947c, extendedUserStatsViewModel.f317049N.b(this.f317012s));
            a aVar = new a(extendedUserStatsViewModel);
            this.f317010q = 1;
            if (interfaceC43160iI.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
