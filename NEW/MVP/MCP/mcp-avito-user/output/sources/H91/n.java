package h91;

import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.context_actions.ContextAction;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.messenger.context_actions.ItemsRequest;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import g91.C40551A;
import g91.C40552B;
import g91.C40553C;
import g91.C40554a;
import g91.C40555b;
import g91.C40558e;
import g91.C40560g;
import g91.C40561h;
import g91.C40562i;
import g91.D;
import g91.E;
import g91.G;
import g91.p;
import g91.q;
import g91.r;
import g91.t;
import g91.u;
import g91.v;
import g91.w;
import g91.y;
import g91.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.api.entity.body.CallReference;
import ru.avito.messenger.api.entity.body.ImageReference;
import ru.avito.messenger.api.entity.body.ItemReference;
import ru.avito.messenger.api.entity.body.Text;
import ru.avito.messenger.api.entity.body.Unknown;
import ru.avito.messenger.generated.api.send_text_message.Action;
import ru.avito.messenger.generated.api.send_text_message.ActionHandler;
import ru.avito.messenger.generated.api.send_text_message.Attribute;
import ru.avito.messenger.generated.api.send_text_message.BaseItemAction;
import ru.avito.messenger.generated.api.send_text_message.CallItemAction;
import ru.avito.messenger.generated.api.send_text_message.CallbackItemAction;
import ru.avito.messenger.generated.api.send_text_message.Chunk;
import ru.avito.messenger.generated.api.send_text_message.DomainError;
import ru.avito.messenger.generated.api.send_text_message.ItemTextField;
import ru.avito.messenger.generated.api.send_text_message.Message;
import ru.avito.messenger.generated.api.send_text_message.MessageBodyAppCallNullable;
import ru.avito.messenger.generated.api.send_text_message.MessageBodyCompositeNullable;
import ru.avito.messenger.generated.api.send_text_message.MessageContextActionsNullable;
import ru.avito.messenger.generated.api.send_text_message.Preview;

/* compiled from: SendTextMessageApicoResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh91/n;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f397071a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f397072b;

    /* compiled from: SendTextMessageApicoResponseConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f397073a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f397074b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f397075c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f397076d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f397077e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f397078f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f397079g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f397080h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f397081i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f397082j;

        static {
            int[] iArr = new int[DomainError.Code.values().length];
            try {
                iArr[DomainError.Code.CoreError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DomainError.Code.Forbidden.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DomainError.Code.NotFound.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DomainError.Code.NoVerifiedPhones.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DomainError.Code.EmployeeModeEnabled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DomainError.Code.ContactLimitExceeded.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DomainError.Code.NotAcceptable.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f397073a = iArr;
            int[] iArr2 = new int[Message.Type.values().length];
            try {
                iArr2[Message.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Message.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Message.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Message.Type.Int4.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Message.Type.Int5.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Message.Type.Int6.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Message.Type.Int7.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Message.Type.Int8.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Message.Type.Int9.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[Message.Type.Int10.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[Message.Type.Int11.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[Message.Type.Int12.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[Message.Type.Int13.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[Message.Type.Int14.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[Message.Type.Int0.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            f397074b = iArr2;
            int[] iArr3 = new int[Chunk.Type.values().length];
            try {
                iArr3[Chunk.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[Chunk.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[Chunk.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[Chunk.Type.Int6.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[Chunk.Type.Int8.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[Chunk.Type.Int9.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[Chunk.Type.Int0.ordinal()] = 7;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[Chunk.Type.Int12.ordinal()] = 8;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[Chunk.Type.Int13.ordinal()] = 9;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr3[Chunk.Type.Int5.ordinal()] = 10;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr3[Chunk.Type.Int4.ordinal()] = 11;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr3[Chunk.Type.Int7.ordinal()] = 12;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr3[Chunk.Type.Int10.ordinal()] = 13;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr3[Chunk.Type.Int11.ordinal()] = 14;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr3[Chunk.Type.Int14.ordinal()] = 15;
            } catch (NoSuchFieldError unused37) {
            }
            f397075c = iArr3;
            int[] iArr4 = new int[ItemTextField.Type.values().length];
            try {
                iArr4[ItemTextField.Type.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[ItemTextField.Type.Geo.ordinal()] = 2;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[ItemTextField.Type.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused40) {
            }
            f397076d = iArr4;
            int[] iArr5 = new int[MessageBodyAppCallNullable.Direction.values().length];
            try {
                iArr5[MessageBodyAppCallNullable.Direction.f431151In.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr5[MessageBodyAppCallNullable.Direction.Out.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr5[MessageBodyAppCallNullable.Direction.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            f397077e = iArr5;
            int[] iArr6 = new int[MessageBodyAppCallNullable.Status.values().length];
            try {
                iArr6[MessageBodyAppCallNullable.Status.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Missed.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Rejected.ordinal()] = 4;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.RejectedByNoMicAccess.ordinal()] = 5;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Busy.ordinal()] = 6;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.NotDelivered.ordinal()] = 7;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Status.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused51) {
            }
            f397078f = iArr6;
            int[] iArr7 = new int[MessageContextActionsNullable.Type.values().length];
            try {
                iArr7[MessageContextActionsNullable.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[MessageContextActionsNullable.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[MessageContextActionsNullable.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            f397079g = iArr7;
            int[] iArr8 = new int[Preview.Type.values().length];
            try {
                iArr8[Preview.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr8[Preview.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr8[Preview.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused57) {
            }
            f397080h = iArr8;
            int[] iArr9 = new int[Action.Type.values().length];
            try {
                iArr9[Action.Type.Int0.ordinal()] = 1;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr9[Action.Type.Int1.ordinal()] = 2;
            } catch (NoSuchFieldError unused59) {
            }
            f397081i = iArr9;
            int[] iArr10 = new int[ActionHandler.Type.values().length];
            try {
                iArr10[ActionHandler.Type.Int0.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr10[ActionHandler.Type.Int1.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            f397082j = iArr10;
        }
    }

    public n(@Y61.k x xVar, @Y61.k Gson gson) {
        this.f397071a = xVar;
        this.f397072b = gson;
    }

    public static k a(Chunk chunk, Message message) {
        return new k("GetUserVisibleMessagesApicoResponseConverter ApiMessageBody apicoMessage.type = " + message.getType() + ". Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Chunk type = " + chunk.getType() + ". Required body is null");
    }

    public static k b(Message message) {
        return new k("GetUserVisibleMessagesApicoResponseConverter ApiMessageBody apicoMessage.type = " + message.getType() + ". Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Required body is null");
    }

    public static k c(Message message, String str) {
        return new k("GetUserVisibleMessagesApicoResponseConverter Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Required property " + str + " is missing");
    }

    public static void k(String str) {
        V2.f318762a.j("GetUserVisibleMessagesApicoResponseConverter", "", new l("Unsupported type in ".concat(str)));
    }

    @Y61.k
    public final PlatformSupport d(@Y61.k E e12) {
        ArrayList arrayList;
        List<Integer> listB = e12.b();
        AttributedText attributedTextH = null;
        if (listB != null) {
            arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                String str = iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? null : "android" : "ios" : "mav" : "web";
                if (str != null) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = null;
        }
        C40551A fallback = e12.getFallback();
        if (fallback != null) {
            AttributedText attributedText = fallback.getAttributedText();
            attributedTextH = attributedText == null ? h(fallback.getText(), fallback.b()) : attributedText;
        }
        return new PlatformSupport(arrayList, attributedTextH);
    }

    public final PlatformActions.ExpandableData e(C40560g c40560g) {
        String titleShort = c40560g.getTitleShort();
        D cancelAction = c40560g.getCancelAction();
        return new PlatformActions.ExpandableData(titleShort, cancelAction != null ? j(cancelAction) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.avito.android.remote.model.messenger.context_actions.ContextActionHandler$Link] */
    @Y61.l
    public final PlatformActions f(@Y61.k MessageContextActionsNullable messageContextActionsNullable, @Y61.k Message message) throws k {
        String str;
        ContextActionHandler.MethodCall link;
        int i12 = a.f397079g[messageContextActionsNullable.getType().ordinal()];
        int i13 = 2;
        int i14 = 1;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                k("ApicoMessageContextActions.type");
                return new PlatformActions.None(Long.valueOf(messageContextActionsNullable.getVersion()));
            }
            g91.o itemsList = messageContextActionsNullable.getItemsList();
            if (itemsList == null) {
                throw c(message, "apicoMessageContextActions.itemsList");
            }
            C40560g expandable = itemsList.getExpandable();
            if ((expandable != null ? e(expandable) : null) == null) {
                return new PlatformActions.None(Long.valueOf(messageContextActionsNullable.getVersion()));
            }
            String title = itemsList.getTitle();
            D itemsRequest = itemsList.getItemsRequest();
            if (itemsRequest == null) {
                throw c(message, PlatformActions.ItemsList.ITEMS_REQUEST);
            }
            String method = itemsRequest.getMethod();
            Map<String, Object> mapB = itemsRequest.b();
            ItemsRequest itemsRequest2 = new ItemsRequest(method, mapB != null ? new RawJson(this.f397072b.l(mapB)) : null);
            String messageId = messageContextActionsNullable.getMessageId();
            E platformSupport = message.getPlatformSupport();
            PlatformSupport platformSupportD = platformSupport != null ? d(platformSupport) : null;
            Long lValueOf = Long.valueOf(messageContextActionsNullable.getVersion());
            PlatformActions.ExpandableData expandableDataE = e(itemsList.getExpandable());
            Boolean hideKeyboard = itemsList.getHideKeyboard();
            return new PlatformActions.ItemsList(title, itemsRequest2, messageId, platformSupportD, lValueOf, expandableDataE, hideKeyboard != null ? hideKeyboard.booleanValue() : false);
        }
        C40555b actions = messageContextActionsNullable.getActions();
        if (actions == null) {
            return null;
        }
        String title2 = actions.getTitle();
        List<Action> listA = actions.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        for (Action action : listA) {
            int i15 = a.f397081i[action.getType().ordinal()];
            if (i15 == i14) {
                str = "primary";
            } else {
                if (i15 != i13) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "secondary";
            }
            String str2 = str;
            String text = action.getText();
            ActionHandler handler = action.getHandler();
            int i16 = a.f397082j[handler.getType().ordinal()];
            if (i16 == i14) {
                q valueLink = handler.getValueLink();
                if (valueLink == null) {
                    throw new k("valueLink is null for ActionHandler.LINK");
                }
                link = new ContextActionHandler.Link(valueLink.getUrl(), valueLink.getRawDeeplink());
            } else {
                if (i16 != i13) {
                    throw new NoWhenBranchMatchedException();
                }
                D valueMethodCall = handler.getValueMethodCall();
                if (valueMethodCall == null) {
                    throw new k("valueMethodCall is null for ActionHandler.METHOD_CALL");
                }
                link = j(valueMethodCall);
            }
            C40554a confirmation = action.getConfirmation();
            arrayList.add(new ContextAction(text, str2, link, confirmation != null ? new ActionConfirmation(confirmation.getTitle(), confirmation.getDescription(), confirmation.getConfirmText(), confirmation.getCancelText()) : null, action.getAnalytics()));
            i13 = 2;
            i14 = 1;
        }
        String messageId2 = messageContextActionsNullable.getMessageId();
        E platformSupport2 = message.getPlatformSupport();
        PlatformSupport platformSupportD2 = platformSupport2 != null ? d(platformSupport2) : null;
        Long lValueOf2 = Long.valueOf(messageContextActionsNullable.getVersion());
        C40560g expandable2 = actions.getExpandable();
        PlatformActions.ExpandableData expandableDataE2 = expandable2 != null ? e(expandable2) : null;
        Boolean hideKeyboard2 = actions.getHideKeyboard();
        return new PlatformActions.Actions(title2, arrayList, messageId2, platformSupportD2, lValueOf2, expandableDataE2, hideKeyboard2 != null ? hideKeyboard2.booleanValue() : false, L.f(actions.getUseMultiButtons(), Boolean.TRUE) ? PlatformActions.MultiButtonsData.INSTANCE : null);
    }

    @Y61.k
    public final MessageBody.SystemMessageBody.Platform.Bubble g(@Y61.k Chunk chunk, @Y61.k Message message) throws k, l {
        Image image;
        String str;
        MessageBody.SystemMessageBody.Platform.ItemExtended itemExtended;
        MessageBody.SystemMessageBody.ExtendedActions extendedActions;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton2;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton3;
        String str2;
        Iterator it;
        Image image2;
        String str3;
        Parcelable text;
        ArrayList arrayList;
        MessageBody.SystemMessageBody.Platform.Bubble image3;
        ArrayList arrayList2;
        AttributedText attributedTextH;
        String text2;
        MarkersRequest markersRequest = null;
        switch (a.f397075c[chunk.getType().ordinal()]) {
            case 1:
                C40551A text3 = chunk.getText();
                if (text3 != null) {
                    return new MessageBody.SystemMessageBody.Platform.Bubble.Text(h(text3.getText(), text3.b()));
                }
                throw a(chunk, message);
            case 2:
                g91.x item = chunk.getItem();
                if (item == null) {
                    throw a(chunk, message);
                }
                String strValueOf = String.valueOf(item.getItemId());
                String title = item.getTitle();
                if (title == null) {
                    throw c(message, "title");
                }
                String priceString = item.getPriceString();
                if (priceString == null) {
                    throw c(message, "priceString");
                }
                String oldPriceString = item.getOldPriceString();
                String locationWithMetro = item.getLocationWithMetro();
                Image imageBySizes = item.getImageBySizes();
                String uriPath = item.getUriPath();
                if (uriPath == null) {
                    throw c(message, MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH);
                }
                g91.m extended = item.getExtended();
                if (extended != null) {
                    AttributedText price = extended.getPrice();
                    List<C40562i> listB = extended.b();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listB, 10));
                    for (C40562i c40562i : listB) {
                        arrayList3.add(new UniversalImage(c40562i.getValue(), c40562i.getValueDark()));
                    }
                    List<ItemTextField> listD = extended.d();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = listD.iterator();
                    while (it2.hasNext()) {
                        ItemTextField itemTextField = (ItemTextField) it2.next();
                        int i12 = a.f397076d[itemTextField.getType().ordinal()];
                        if (i12 == 1) {
                            it = it2;
                            image2 = imageBySizes;
                            str3 = uriPath;
                            String str4 = itemTextField.getType().f431145b;
                            AttributedText attributedText = itemTextField.getContent().getAttributedText();
                            if (attributedText == null) {
                                attributedText = new AttributedText("Ошибка", C42784z0.f406748b, 0, 4, null);
                            }
                            text = new MessageBody.SystemMessageBody.ExtendedTextFields.Text(str4, attributedText);
                        } else if (i12 == 2) {
                            g91.n content = itemTextField.getContent();
                            String distance = content.getDistance();
                            String distanceInTime = content.getDistanceInTime();
                            List<p> listE = content.e();
                            if (listE != null) {
                                List<p> list = listE;
                                it = it2;
                                image2 = imageBySizes;
                                str3 = uriPath;
                                ArrayList arrayList5 = new ArrayList(C42745f0.q(list, 10));
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList5.add(new MessageBody.SystemMessageBody.ExtendedColor(((p) it3.next()).getColor()));
                                }
                                arrayList = arrayList5;
                            } else {
                                it = it2;
                                image2 = imageBySizes;
                                str3 = uriPath;
                                arrayList = null;
                            }
                            text = new MessageBody.SystemMessageBody.ExtendedTextFields.Content(itemTextField.getType().f431145b, new MessageBody.SystemMessageBody.ExtendedContent(distance, distanceInTime, arrayList, content.getName(), content.getAddress()));
                        } else {
                            if (i12 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            k("ApicoItemTextField.type");
                            it = it2;
                            image2 = imageBySizes;
                            str3 = uriPath;
                            text = null;
                        }
                        if (text != null) {
                            arrayList4.add(text);
                        }
                        it2 = it;
                        imageBySizes = image2;
                        uriPath = str3;
                    }
                    image = imageBySizes;
                    str = uriPath;
                    g91.l actions = extended.getActions();
                    if (actions != null) {
                        CallbackItemAction callback = actions.getCallback();
                        x xVar = this.f397071a;
                        if (callback != null) {
                            String title2 = callback.getTitle();
                            CallbackItemAction.Style style = callback.getStyle();
                            extendedButton = new MessageBody.SystemMessageBody.ExtendedButton(title2, style != null ? style.f431133b : null, callback.getUri(), xVar.b(callback.getUri()));
                        } else {
                            extendedButton = null;
                        }
                        BaseItemAction message2 = actions.getMessage();
                        if (message2 != null) {
                            String title3 = message2.getTitle();
                            BaseItemAction.Style style2 = message2.getStyle();
                            if (style2 == null || (str2 = style2.f431114b) == null) {
                                str2 = "accentSmall";
                            }
                            extendedButton2 = new MessageBody.SystemMessageBody.ExtendedButton(title3, str2, message2.getUri(), xVar.b(message2.getUri()));
                        } else {
                            extendedButton2 = null;
                        }
                        CallItemAction call = actions.getCall();
                        if (call != null) {
                            String title4 = call.getTitle();
                            CallItemAction.Style style3 = call.getStyle();
                            extendedButton3 = new MessageBody.SystemMessageBody.ExtendedButton(title4, style3 != null ? style3.f431123b : null, call.getUri(), xVar.b(call.getUri()));
                        } else {
                            extendedButton3 = null;
                        }
                        extendedActions = new MessageBody.SystemMessageBody.ExtendedActions(extendedButton, extendedButton2, extendedButton3);
                    } else {
                        extendedActions = null;
                    }
                    itemExtended = new MessageBody.SystemMessageBody.Platform.ItemExtended(price, arrayList3, arrayList4, extendedActions);
                } else {
                    image = imageBySizes;
                    str = uriPath;
                    itemExtended = null;
                }
                return new MessageBody.SystemMessageBody.Platform.Bubble.Item(strValueOf, title, priceString, oldPriceString, locationWithMetro, image, str, itemExtended);
            case 3:
                w image4 = chunk.getImage();
                if (image4 == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.Image(image4.getImageId(), null);
                break;
            case 4:
                z location = chunk.getLocation();
                if (location == null) {
                    throw a(chunk, message);
                }
                String title5 = location.getTitle();
                if (title5 == null) {
                    throw c(message, "title");
                }
                List<C40561h> listA = location.a();
                ArrayList arrayList6 = new ArrayList(C42745f0.q(listA, 10));
                for (C40561h c40561h : listA) {
                    String title6 = c40561h.getTitle();
                    List<C40551A> listA2 = c40561h.a();
                    if (listA2 != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (C40551A c40551a : listA2) {
                            if (c40551a == null || (attributedTextH = c40551a.getAttributedText()) == null) {
                                attributedTextH = (c40551a == null || (text2 = c40551a.getText()) == null) ? null : h(text2, c40551a.b());
                            }
                            if (attributedTextH != null) {
                                arrayList7.add(attributedTextH);
                            }
                        }
                        arrayList2 = arrayList7;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList6.add(new GeoMarker(c40561h.getLat(), c40561h.getLon(), title6, arrayList2));
                }
                GeoMarker[] geoMarkerArr = (GeoMarker[]) arrayList6.toArray(new GeoMarker[0]);
                D markersRequest2 = location.getMarkersRequest();
                if (markersRequest2 != null) {
                    String method = markersRequest2.getMethod();
                    Map<String, Object> mapB = markersRequest2.b();
                    markersRequest = new MarkersRequest(method, mapB != null ? new RawJson(this.f397072b.l(mapB)) : RawJson.INSTANCE.getEMPTY());
                }
                return new MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation(title5, geoMarkerArr, markersRequest);
            case 5:
                v file = chunk.getFile();
                if (file == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.File(file.getFileId(), file.getName(), file.getSizeBytes());
                break;
            case 6:
                C40552B video = chunk.getVideo();
                if (video == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.Video(video.getVideoId());
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new l("Unsupported type in ApicoChunk.type - Platform message chunk type " + chunk.getType());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return image3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.avito.android.remote.model.text.LinkAttribute] */
    @Y61.k
    public final AttributedText h(@Y61.k String str, @Y61.l Map map) {
        ?? arrayList;
        String title;
        if (map != null) {
            arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Attribute attribute = (Attribute) entry.getValue();
                DeepLinkAttribute linkAttribute = null;
                if (attribute.getValue() != null && attribute.getType() == Attribute.Type.Int0 && (title = attribute.getValue().getTitle()) != null) {
                    String url = attribute.getValue().getUrl();
                    String deepLink = attribute.getValue().getDeepLink();
                    DeepLink deepLinkB = deepLink != null ? this.f397071a.b(deepLink) : null;
                    if (deepLinkB != null && !(deepLinkB instanceof NoMatchLink)) {
                        linkAttribute = new DeepLinkAttribute(str2, title, deepLinkB, url, deepLink, null);
                    } else if (url != null) {
                        linkAttribute = new LinkAttribute(str2, title, url, null);
                    }
                }
                if (linkAttribute != null) {
                    arrayList.add(linkAttribute);
                }
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return new AttributedText(str, arrayList, 0);
    }

    @Y61.k
    public final ru.avito.messenger.api.entity.body.MessageBody i(@Y61.k t tVar, @Y61.k Message message) throws k {
        ru.avito.messenger.api.entity.body.MessageBody link;
        MessageBody.Link.Preview snippet;
        MessageBody.AppCall.Direction unsupported;
        MessageBody.AppCall.Status unsupported2;
        MessageBody.Link.Preview preview = null;
        preview = null;
        switch (a.f397074b[message.getType().ordinal()]) {
            case 1:
                C40551A text = tVar.getText();
                if (text != null) {
                    return (message.getDeletedAt() == null || message.getDeletedAt().longValue() <= 0) ? new Text(text.getText(), tVar.getIdempotencyKey(), text.getHasTrustedUrls(), text.getAttributedText()) : new MessageBody.Deleted(text.getText(), tVar.getIdempotencyKey());
                }
                throw b(message);
            case 2:
                g91.x item = tVar.getItem();
                if (item != null) {
                    return new ItemReference(String.valueOf(item.getItemId()), tVar.getIdempotencyKey());
                }
                throw b(message);
            case 3:
                w image = tVar.getImage();
                if (image != null) {
                    return new ImageReference(image.getImageId(), tVar.getIdempotencyKey());
                }
                throw b(message);
            case 4:
                u call = tVar.getCall();
                if (call != null) {
                    return new CallReference(call.getTargetUserId(), tVar.getIdempotencyKey());
                }
                throw b(message);
            case 5:
                y link2 = tVar.getLink();
                if (link2 == null) {
                    throw b(message);
                }
                String url = link2.getUrl();
                Preview preview2 = link2.getPreview();
                if (preview2 != null) {
                    Preview.Type type = preview2.getType();
                    int i12 = type == null ? -1 : a.f397080h[type.ordinal()];
                    if (i12 == -1) {
                        throw c(message, "ApicoPreview.type");
                    }
                    if (i12 == 1) {
                        r linkPreview = preview2.getLinkPreview();
                        if (linkPreview == null) {
                            throw c(message, "linkPreview");
                        }
                        snippet = new MessageBody.Link.Preview.Snippet(linkPreview.getUrl(), null, linkPreview.getDomain(), linkPreview.getTrusted(), linkPreview.getTitle(), linkPreview.getSubtitle(), linkPreview.getDescription(), linkPreview.getImageId(), null, null, null, null);
                    } else if (i12 == 2) {
                        g91.j imagePreview = preview2.getImagePreview();
                        if (imagePreview == null) {
                            throw c(message, "imagePreview");
                        }
                        snippet = new MessageBody.Link.Preview.Image(imagePreview.getUrl(), imagePreview.getDomain(), imagePreview.getTrusted(), imagePreview.getImageId(), null, null, null, null);
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k("ApicoPreview.type");
                    }
                    preview = snippet;
                }
                link = new MessageBody.Link(url, preview, tVar.getIdempotencyKey(), link2.getIsTrusted());
                break;
            case 6:
                z location = tVar.getLocation();
                if (location == null) {
                    throw b(message);
                }
                C40561h c40561h = (C40561h) C42745f0.G(location.a());
                if (c40561h == null) {
                    throw c(message, "latitude");
                }
                double lat = c40561h.getLat();
                C40561h c40561h2 = (C40561h) C42745f0.G(location.a());
                if (c40561h2 == null) {
                    throw c(message, "longitude");
                }
                double lon = c40561h2.getLon();
                String title = location.getTitle();
                if (title == null) {
                    throw c(message, "title");
                }
                C40561h c40561h3 = (C40561h) C42745f0.G(location.a());
                link = new MessageBody.Location(lat, lon, title, c40561h3 != null ? c40561h3.getKind() : null, tVar.getIdempotencyKey());
                break;
            case 7:
                MessageBodyAppCallNullable appCall = tVar.getAppCall();
                if (appCall == null) {
                    throw b(message);
                }
                String text2 = appCall.getText();
                C40558e call2 = appCall.getCall();
                if (call2 == null) {
                    throw c(message, "call");
                }
                com.avito.android.remote.model.Action action = new com.avito.android.remote.model.Action(call2.getTitle(), this.f397071a.b(call2.getUri()), null, null, call2.getUri(), null, null, null, null, null, null, null, null, null, null, null, 65516, null);
                String callId = appCall.getCallId();
                Long duration = appCall.getDuration();
                int i13 = a.f397077e[appCall.getDirection().ordinal()];
                if (i13 == 1) {
                    unsupported = MessageBody.AppCall.Direction.Incoming.INSTANCE;
                } else if (i13 == 2) {
                    unsupported = MessageBody.AppCall.Direction.Outgoing.INSTANCE;
                } else {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    unsupported = new MessageBody.AppCall.Direction.Unsupported("none");
                }
                MessageBody.AppCall.Direction direction = unsupported;
                switch (a.f397078f[appCall.getStatus().ordinal()]) {
                    case 1:
                        unsupported2 = MessageBody.AppCall.Status.Success.INSTANCE;
                        break;
                    case 2:
                        unsupported2 = MessageBody.AppCall.Status.Missed.INSTANCE;
                        break;
                    case 3:
                        unsupported2 = MessageBody.AppCall.Status.Canceled.INSTANCE;
                        break;
                    case 4:
                        unsupported2 = MessageBody.AppCall.Status.Rejected.INSTANCE;
                        break;
                    case 5:
                        unsupported2 = MessageBody.AppCall.Status.Rejected.INSTANCE;
                        break;
                    case 6:
                        unsupported2 = MessageBody.AppCall.Status.Busy.INSTANCE;
                        break;
                    case 7:
                        unsupported2 = MessageBody.AppCall.Status.NotDelivered.INSTANCE;
                        break;
                    case 8:
                        unsupported2 = new MessageBody.AppCall.Status.Unsupported("unknown_type");
                        k("ApicoAppCallStatus");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new MessageBody.AppCall(text2, action, callId, duration, direction, unsupported2, appCall.getTitle(), appCall.getSubTitle(), appCall.getIsVideo(), tVar.getIdempotencyKey());
            case 8:
                v file = tVar.getFile();
                if (file != null) {
                    return new MessageBody.File(file.getFileId(), file.getName(), file.getSizeBytes(), null, tVar.getIdempotencyKey());
                }
                throw b(message);
            case 9:
                C40552B video = tVar.getVideo();
                if (video != null) {
                    return new MessageBody.Video(video.getFileId(), video.getVideoId(), tVar.getIdempotencyKey());
                }
                throw b(message);
            case 10:
                MessageBodyCompositeNullable composite = tVar.getComposite();
                if (composite == null) {
                    throw b(message);
                }
                String text3 = composite.getText();
                try {
                    List<Chunk> listA = composite.a();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(g((Chunk) it.next(), message));
                    }
                    MessageContextActionsNullable contextActions = message.getContextActions();
                    PlatformActions platformActionsF = contextActions != null ? f(contextActions, message) : null;
                    String flowName = composite.getFlowName();
                    g91.k inputState = message.getInputState();
                    return new MessageBody.SystemMessageBody.Platform.FromAvito(arrayList, platformActionsF, flowName, text3, inputState != null ? new InputState(inputState.getIsDisabled(), inputState.getReason(), inputState.getDescription()) : null);
                } catch (Throwable th2) {
                    V2.f318762a.a("GetUserVisibleMessagesApicoResponseConverter", "Failed to convert ApicoAvitoPlatformMessageBody", th2);
                    return !C43066x.K(text3) ? new MessageBody.SystemMessageBody.Platform.FromAvito(Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText(composite.getText(), C42784z0.f406748b, 0, 4, null))), null, null, null, null, 30, null) : new Unknown(MessageBody.SystemMessageBody.Platform.FromAvito.TYPE, tVar.getIdempotencyKey());
                }
            case 11:
                MessageBodyCompositeNullable composite2 = tVar.getComposite();
                if (composite2 == null) {
                    throw b(message);
                }
                String text4 = composite2.getText();
                try {
                    List<Chunk> listA2 = composite2.a();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listA2, 10));
                    Iterator<T> it2 = listA2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(g((Chunk) it2.next(), message));
                    }
                    MessageContextActionsNullable contextActions2 = message.getContextActions();
                    PlatformActions platformActionsF2 = contextActions2 != null ? f(contextActions2, message) : null;
                    String flowName2 = composite2.getFlowName();
                    g91.k inputState2 = message.getInputState();
                    return new MessageBody.SystemMessageBody.Platform.FromUser(arrayList2, platformActionsF2, flowName2, text4, inputState2 != null ? new InputState(inputState2.getIsDisabled(), inputState2.getReason(), inputState2.getDescription()) : null);
                } catch (Throwable th3) {
                    V2.f318762a.a("GetUserVisibleMessagesApicoResponseConverter", "Failed to convert ApicoImpersonatedPlatformMessageBody", th3);
                    return !C43066x.K(text4) ? new MessageBody.SystemMessageBody.Platform.FromUser(Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText(composite2.getText(), C42784z0.f406748b, 0, 4, null))), null, null, null, null, 30, null) : new Unknown(MessageBody.SystemMessageBody.Platform.FromUser.TYPE, tVar.getIdempotencyKey());
                }
            case 12:
                C40551A text5 = tVar.getText();
                if (text5 != null) {
                    return new MessageBody.Text.Reaction(text5.getText(), null, tVar.getIdempotencyKey(), text5.getAttributedText(), 2, null);
                }
                throw b(message);
            case 13:
                C40551A text6 = tVar.getText();
                if (text6 != null) {
                    return new MessageBody.Deleted(text6.getText(), tVar.getIdempotencyKey());
                }
                throw b(message);
            case 14:
                C40553C voice = tVar.getVoice();
                if (voice != null) {
                    return new MessageBody.Voice(voice.getVoiceId(), tVar.getIdempotencyKey());
                }
                throw b(message);
            case 15:
                k("ApicoMessage.type");
                return new Unknown("unknown_type", tVar.getIdempotencyKey());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return link;
    }

    @Y61.k
    public final ContextActionHandler.MethodCall j(@Y61.k D d12) {
        String method = d12.getMethod();
        Map<String, Object> mapB = d12.b();
        RawJson rawJson = mapB != null ? new RawJson(this.f397072b.l(mapB)) : null;
        G reaction = d12.getReaction();
        return new ContextActionHandler.MethodCall(method, rawJson, reaction != null ? new ContextActionHandler.MethodCall.Reaction(reaction.getText()) : null);
    }
}
