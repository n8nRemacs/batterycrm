package com.avito.android.rating_form.step;

import com.avito.android.rating_form.C34198a;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import hh0.C40939a;
import ih0.InterfaceC41402a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_rating-form_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: ButtonMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f249180a;

        static {
            int[] iArr = new int[RatingFormAddValueType.Command.ControlFieldsCommand.FieldAction.values().length];
            try {
                iArr[RatingFormAddValueType.Command.ControlFieldsCommand.FieldAction.OPEN_DOCUMENT_PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f249180a = iArr;
        }
    }

    @Y61.k
    public static final ArrayList a(@Y61.k List list, boolean z12, boolean z13) {
        List listSingletonList;
        List<C34198a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (C34198a c34198a : list2) {
            String str = c34198a.f247939a;
            List<RatingFormAddValueType.Command> list3 = c34198a.f247941c;
            ArrayList arrayList2 = new ArrayList();
            for (RatingFormAddValueType.Command command : list3) {
                if (command instanceof RatingFormAddValueType.Command.FinishCommand) {
                    listSingletonList = Collections.singletonList(InterfaceC41402a.j.f398635a);
                } else if (command instanceof RatingFormAddValueType.Command.SendDeeplinkCommand) {
                    listSingletonList = Collections.singletonList(new InterfaceC41402a.p(((RatingFormAddValueType.Command.SendDeeplinkCommand) command).getData().getUri()));
                } else if (command instanceof RatingFormAddValueType.Command.RevealFieldsCommand) {
                    listSingletonList = Collections.singletonList(new InterfaceC41402a.t(((RatingFormAddValueType.Command.RevealFieldsCommand) command).getData().c()));
                } else if (command instanceof RatingFormAddValueType.Command.ControlFieldsCommand) {
                    List<RatingFormAddValueType.Command.ControlFieldsCommand.Field> listC = ((RatingFormAddValueType.Command.ControlFieldsCommand) command).getData().c();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listC, 10));
                    for (RatingFormAddValueType.Command.ControlFieldsCommand.Field field : listC) {
                        if (a.f249180a[field.getAction().ordinal()] != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList3.add(new InterfaceC41402a.y(field.getSlug()));
                    }
                    listSingletonList = arrayList3;
                } else {
                    if (!(command instanceof RatingFormAddValueType.Command.CloseCommand)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listSingletonList = Collections.singletonList(InterfaceC41402a.f.f398631a);
                }
                C42745f0.h(listSingletonList, arrayList2);
            }
            arrayList.add(new C40939a(str, arrayList2, c34198a.f247940b, z12, z13));
        }
        return arrayList;
    }
}
