package h91;

import a91.C19702A;
import a91.C19703B;
import a91.C19704C;
import a91.C19706E;
import a91.C19708G;
import a91.C19710I;
import a91.C19711J;
import a91.C19712K;
import a91.C19713L;
import a91.C19714M;
import a91.C19716O;
import a91.C19718Q;
import a91.C19719S;
import a91.C19720a;
import a91.C19721b;
import a91.C19723d;
import a91.C19724e;
import a91.C19725f;
import a91.C19726g;
import a91.C19727h;
import a91.C19728i;
import a91.C19729j;
import a91.C19730k;
import a91.C19731l;
import a91.C19735p;
import a91.C19745z;
import a91.T;
import a91.U;
import a91.V;
import a91.W;
import a91.X;
import a91.Y;
import a91.Z;
import a91.a0;
import a91.b0;
import a91.c0;
import a91.e0;
import a91.i0;
import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.messenger.context.ChannelMenuAction;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.api.entity.Image;
import ru.avito.messenger.api.entity.body.CallReference;
import ru.avito.messenger.api.entity.body.ImageReference;
import ru.avito.messenger.api.entity.body.ItemReference;
import ru.avito.messenger.api.entity.body.Text;
import ru.avito.messenger.api.entity.body.Unknown;
import ru.avito.messenger.generated.api.create_item_channel.Action;
import ru.avito.messenger.generated.api.create_item_channel.ActionHandler;
import ru.avito.messenger.generated.api.create_item_channel.Attribute;
import ru.avito.messenger.generated.api.create_item_channel.BaseItemAction;
import ru.avito.messenger.generated.api.create_item_channel.CallItemAction;
import ru.avito.messenger.generated.api.create_item_channel.CallbackItemAction;
import ru.avito.messenger.generated.api.create_item_channel.Channel;
import ru.avito.messenger.generated.api.create_item_channel.ChannelContextActionsNullable;
import ru.avito.messenger.generated.api.create_item_channel.Chunk;
import ru.avito.messenger.generated.api.create_item_channel.DomainError;
import ru.avito.messenger.generated.api.create_item_channel.ItemTextField;
import ru.avito.messenger.generated.api.create_item_channel.MenuElement;
import ru.avito.messenger.generated.api.create_item_channel.Message;
import ru.avito.messenger.generated.api.create_item_channel.MessageBodyAppCallNullable;
import ru.avito.messenger.generated.api.create_item_channel.MessageBodyCompositeNullable;
import ru.avito.messenger.generated.api.create_item_channel.MessageContextActionsNullable;
import ru.avito.messenger.generated.api.create_item_channel.Preview;

/* compiled from: CreateChannelByItemApicoResponseConverter.kt */
@h31.j
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lh91/a;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: h91.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40785a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f397016a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f397017b;

    /* compiled from: CreateChannelByItemApicoResponseConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h91.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11244a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f397018a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f397019b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f397020c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f397021d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f397022e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f397023f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f397024g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f397025h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int[] f397026i;

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ int[] f397027j;

        /* renamed from: k, reason: collision with root package name */
        public static final /* synthetic */ int[] f397028k;

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int[] f397029l;

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
            f397018a = iArr;
            int[] iArr2 = new int[Channel.Type.values().length];
            try {
                iArr2[Channel.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Channel.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Channel.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Channel.Type.Int4.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Channel.Type.Int0.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            f397019b = iArr2;
            int[] iArr3 = new int[Message.Type.values().length];
            try {
                iArr3[Message.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Message.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[Message.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[Message.Type.Int4.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[Message.Type.Int5.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[Message.Type.Int6.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[Message.Type.Int7.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[Message.Type.Int8.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[Message.Type.Int9.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[Message.Type.Int10.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[Message.Type.Int11.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[Message.Type.Int12.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[Message.Type.Int13.ordinal()] = 13;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[Message.Type.Int14.ordinal()] = 14;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[Message.Type.Int0.ordinal()] = 15;
            } catch (NoSuchFieldError unused27) {
            }
            f397020c = iArr3;
            int[] iArr4 = new int[Chunk.Type.values().length];
            try {
                iArr4[Chunk.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[Chunk.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[Chunk.Type.Int3.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[Chunk.Type.Int6.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[Chunk.Type.Int8.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[Chunk.Type.Int9.ordinal()] = 6;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[Chunk.Type.Int0.ordinal()] = 7;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[Chunk.Type.Int12.ordinal()] = 8;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr4[Chunk.Type.Int13.ordinal()] = 9;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[Chunk.Type.Int5.ordinal()] = 10;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[Chunk.Type.Int4.ordinal()] = 11;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[Chunk.Type.Int7.ordinal()] = 12;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[Chunk.Type.Int10.ordinal()] = 13;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[Chunk.Type.Int11.ordinal()] = 14;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[Chunk.Type.Int14.ordinal()] = 15;
            } catch (NoSuchFieldError unused42) {
            }
            f397021d = iArr4;
            int[] iArr5 = new int[ItemTextField.Type.values().length];
            try {
                iArr5[ItemTextField.Type.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr5[ItemTextField.Type.Geo.ordinal()] = 2;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr5[ItemTextField.Type.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused45) {
            }
            f397022e = iArr5;
            int[] iArr6 = new int[MessageBodyAppCallNullable.Direction.values().length];
            try {
                iArr6[MessageBodyAppCallNullable.Direction.f430815In.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Direction.Out.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[MessageBodyAppCallNullable.Direction.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            f397023f = iArr6;
            int[] iArr7 = new int[MessageBodyAppCallNullable.Status.values().length];
            try {
                iArr7[MessageBodyAppCallNullable.Status.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr7[MessageBodyAppCallNullable.Status.Missed.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[MessageBodyAppCallNullable.Status.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr7[MessageBodyAppCallNullable.Status.Rejected.ordinal()] = 4;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr7[MessageBodyAppCallNullable.Status.RejectedByNoMicAccess.ordinal()] = 5;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr7[MessageBodyAppCallNullable.Status.Busy.ordinal()] = 6;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[MessageBodyAppCallNullable.Status.NotDelivered.ordinal()] = 7;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr7[MessageBodyAppCallNullable.Status.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused56) {
            }
            f397024g = iArr7;
            int[] iArr8 = new int[MessageContextActionsNullable.Type.values().length];
            try {
                iArr8[MessageContextActionsNullable.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr8[MessageContextActionsNullable.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr8[MessageContextActionsNullable.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused59) {
            }
            f397025h = iArr8;
            int[] iArr9 = new int[Preview.Type.values().length];
            try {
                iArr9[Preview.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr9[Preview.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr9[Preview.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused62) {
            }
            f397026i = iArr9;
            int[] iArr10 = new int[Action.Type.values().length];
            try {
                iArr10[Action.Type.Int0.ordinal()] = 1;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr10[Action.Type.Int1.ordinal()] = 2;
            } catch (NoSuchFieldError unused64) {
            }
            f397027j = iArr10;
            int[] iArr11 = new int[ActionHandler.Type.values().length];
            try {
                iArr11[ActionHandler.Type.Int0.ordinal()] = 1;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr11[ActionHandler.Type.Int1.ordinal()] = 2;
            } catch (NoSuchFieldError unused66) {
            }
            f397028k = iArr11;
            int[] iArr12 = new int[ChannelContextActionsNullable.Type.values().length];
            try {
                iArr12[ChannelContextActionsNullable.Type.Int1.ordinal()] = 1;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr12[ChannelContextActionsNullable.Type.Int2.ordinal()] = 2;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr12[ChannelContextActionsNullable.Type.Int0.ordinal()] = 3;
            } catch (NoSuchFieldError unused69) {
            }
            f397029l = iArr12;
        }
    }

    @Inject
    public C40785a(@Y61.k x xVar, @Y61.k Gson gson) {
        this.f397016a = xVar;
        this.f397017b = gson;
    }

    public static k a(Chunk chunk, Message message) {
        return new k("GetChannelByIdApicoResponseConverter ApiMessageBody apicoMessage.type = " + message.getType() + ". Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Chunk type = " + chunk.getType() + ". Required body is null");
    }

    public static k b(Message message) {
        return new k("GetChannelByIdApicoResponseConverter ApiMessageBody apicoMessage.type = " + message.getType() + ". Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Required body is null");
    }

    public static k c(Message message, String str) {
        return new k("GetChannelByIdApicoResponseConverter Channel id = " + message.getChannelId() + ". Message id = " + message.getId() + ". Required property " + str + " is missing");
    }

    public static AttachMenu e(C19727h c19727h) {
        C19723d file = c19727h.getFile();
        AttachMenuItem.File file2 = file != null ? new AttachMenuItem.File(file.getTitle(), file.getMaxSizeBytes(), file.getEnableForUnanswered(), file.b()) : null;
        C19724e image = c19727h.getImage();
        AttachMenuItem.Image image2 = image != null ? new AttachMenuItem.Image(image.getTitle(), image.getEnableForUnanswered()) : null;
        C19730k video = c19727h.getVideo();
        AttachMenuItem.Video video2 = video != null ? new AttachMenuItem.Video(video.getTitle(), video.getEnableForUnanswered(), video.getMaxSizeBytes(), video.getMaxDurationSec()) : null;
        C19725f item = c19727h.getItem();
        AttachMenuItem.Item item2 = item != null ? new AttachMenuItem.Item(item.getTitle()) : null;
        C19726g location = c19727h.getLocation();
        AttachMenuItem.Location location2 = location != null ? new AttachMenuItem.Location(location.getTitle(), location.getEnableForUnanswered()) : null;
        C19728i replies = c19727h.getReplies();
        AttachMenuItem.Replies replies2 = replies != null ? new AttachMenuItem.Replies(replies.getTitle()) : null;
        C19731l voice = c19727h.getVoice();
        AttachMenuItem.Voice voice2 = voice != null ? new AttachMenuItem.Voice(voice.getTitle(), voice.getEnableForUnanswered()) : null;
        C19729j support = c19727h.getSupport();
        return new AttachMenu(file2, image2, video2, item2, location2, replies2, voice2, support != null ? new AttachMenuItem.Support(support.getTitle(), support.getEnableForUnanswered(), support.getMessage()) : null);
    }

    @Y61.k
    public static Image k(@Y61.k com.avito.android.remote.model.Image image) {
        Map<Size, Uri> variants = image.getVariants();
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(variants.size()));
        Iterator<T> it = variants.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Size size = (Size) entry.getKey();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(size.getWidth());
            sb2.append('x');
            sb2.append(size.getHeight());
            linkedHashMap.put(sb2.toString(), entry.getValue());
        }
        return new Image(linkedHashMap);
    }

    public static List m(List list) {
        if (list == null) {
            return C42784z0.f406748b;
        }
        List<MenuElement> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (MenuElement menuElement : list2) {
            String title = menuElement.getTitle();
            DeepLink deepLink = menuElement.getDeepLink();
            String str = menuElement.getIcon().f430809b;
            C19718Q confirmation = menuElement.getConfirmation();
            arrayList.add(new ChannelMenuAction(title, deepLink, str, confirmation != null ? new ActionConfirmation(confirmation.getTitle(), confirmation.getDescription(), confirmation.getOk(), confirmation.getCancel()) : null, menuElement.getRawDeeplink()));
        }
        return arrayList;
    }

    public static void o(String str) {
        V2.f318762a.j("GetChannelByIdApicoResponseConverter", "", new l("Unsupported type in ".concat(str)));
    }

    @Y61.k
    public final PlatformSupport d(@Y61.k e0 e0Var) {
        ArrayList arrayList;
        List<Integer> listB = e0Var.b();
        AttributedText attributedTextJ = null;
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
        Z fallback = e0Var.getFallback();
        if (fallback != null) {
            AttributedText attributedText = fallback.getAttributedText();
            attributedTextJ = attributedText == null ? j(fallback.getText(), fallback.b()) : attributedText;
        }
        return new PlatformSupport(arrayList, attributedTextJ);
    }

    public final ContextAction f(Action action) throws k {
        String str;
        ContextActionHandler link;
        int i12 = C11244a.f397027j[action.getType().ordinal()];
        if (i12 == 1) {
            str = "primary";
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "secondary";
        }
        String str2 = str;
        String text = action.getText();
        ActionHandler handler = action.getHandler();
        int i13 = C11244a.f397028k[handler.getType().ordinal()];
        if (i13 == 1) {
            C19714M valueLink = handler.getValueLink();
            if (valueLink == null) {
                throw new k("valueLink is null for ActionHandler.LINK");
            }
            link = new ContextActionHandler.Link(valueLink.getUrl(), valueLink.getRawDeeplink());
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c0 valueMethodCall = handler.getValueMethodCall();
            if (valueMethodCall == null) {
                throw new k("valueMethodCall is null for ActionHandler.METHOD_CALL");
            }
            link = n(valueMethodCall);
        }
        C19720a confirmation = action.getConfirmation();
        return new ContextAction(text, str2, link, confirmation != null ? new ActionConfirmation(confirmation.getTitle(), confirmation.getDescription(), confirmation.getConfirmText(), confirmation.getCancelText()) : null, action.getAnalytics());
    }

    public final PlatformActions.ExpandableData g(C19745z c19745z) {
        String titleShort = c19745z.getTitleShort();
        c0 cancelAction = c19745z.getCancelAction();
        return new PlatformActions.ExpandableData(titleShort, cancelAction != null ? n(cancelAction) : null);
    }

    @Y61.l
    public final PlatformActions h(@Y61.k MessageContextActionsNullable messageContextActionsNullable, @Y61.k Message message) throws k {
        int i12 = C11244a.f397025h[messageContextActionsNullable.getType().ordinal()];
        if (i12 == 1) {
            C19721b actions = messageContextActionsNullable.getActions();
            if (actions == null) {
                return null;
            }
            String title = actions.getTitle();
            List<Action> listA = actions.a();
            ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(f((Action) it.next()));
            }
            String messageId = messageContextActionsNullable.getMessageId();
            e0 platformSupport = message.getPlatformSupport();
            PlatformSupport platformSupportD = platformSupport != null ? d(platformSupport) : null;
            Long lValueOf = Long.valueOf(messageContextActionsNullable.getVersion());
            C19745z expandable = actions.getExpandable();
            PlatformActions.ExpandableData expandableDataG = expandable != null ? g(expandable) : null;
            Boolean hideKeyboard = actions.getHideKeyboard();
            return new PlatformActions.Actions(title, arrayList, messageId, platformSupportD, lValueOf, expandableDataG, hideKeyboard != null ? hideKeyboard.booleanValue() : false, L.f(actions.getUseMultiButtons(), Boolean.TRUE) ? PlatformActions.MultiButtonsData.INSTANCE : null);
        }
        if (i12 != 2) {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            o("ApicoMessageContextActions.type");
            return new PlatformActions.None(Long.valueOf(messageContextActionsNullable.getVersion()));
        }
        C19712K itemsList = messageContextActionsNullable.getItemsList();
        if (itemsList == null) {
            throw c(message, "apicoMessageContextActions.itemsList");
        }
        C19745z expandable2 = itemsList.getExpandable();
        if ((expandable2 != null ? g(expandable2) : null) == null) {
            return new PlatformActions.None(Long.valueOf(messageContextActionsNullable.getVersion()));
        }
        String title2 = itemsList.getTitle();
        c0 itemsRequest = itemsList.getItemsRequest();
        if (itemsRequest == null) {
            throw c(message, PlatformActions.ItemsList.ITEMS_REQUEST);
        }
        String method = itemsRequest.getMethod();
        Map<String, Object> mapB = itemsRequest.b();
        ItemsRequest itemsRequest2 = new ItemsRequest(method, mapB != null ? new RawJson(this.f397017b.l(mapB)) : null);
        String messageId2 = messageContextActionsNullable.getMessageId();
        e0 platformSupport2 = message.getPlatformSupport();
        PlatformSupport platformSupportD2 = platformSupport2 != null ? d(platformSupport2) : null;
        Long lValueOf2 = Long.valueOf(messageContextActionsNullable.getVersion());
        PlatformActions.ExpandableData expandableDataG2 = g(itemsList.getExpandable());
        Boolean hideKeyboard2 = itemsList.getHideKeyboard();
        return new PlatformActions.ItemsList(title2, itemsRequest2, messageId2, platformSupportD2, lValueOf2, expandableDataG2, hideKeyboard2 != null ? hideKeyboard2.booleanValue() : false);
    }

    @Y61.k
    public final MessageBody.SystemMessageBody.Platform.Bubble i(@Y61.k Chunk chunk, @Y61.k Message message) throws k, l {
        com.avito.android.remote.model.Image image;
        String str;
        MessageBody.SystemMessageBody.Platform.ItemExtended itemExtended;
        MessageBody.SystemMessageBody.ExtendedActions extendedActions;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton2;
        MessageBody.SystemMessageBody.ExtendedButton extendedButton3;
        String str2;
        Iterator it;
        com.avito.android.remote.model.Image image2;
        String str3;
        Parcelable text;
        ArrayList arrayList;
        MessageBody.SystemMessageBody.Platform.Bubble image3;
        ArrayList arrayList2;
        AttributedText attributedTextJ;
        String text2;
        MarkersRequest markersRequest = null;
        switch (C11244a.f397021d[chunk.getType().ordinal()]) {
            case 1:
                Z text3 = chunk.getText();
                if (text3 != null) {
                    return new MessageBody.SystemMessageBody.Platform.Bubble.Text(j(text3.getText(), text3.b()));
                }
                throw a(chunk, message);
            case 2:
                W item = chunk.getItem();
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
                com.avito.android.remote.model.Image imageBySizes = item.getImageBySizes();
                String uriPath = item.getUriPath();
                if (uriPath == null) {
                    throw c(message, MessageBody.SystemMessageBody.Platform.Bubble.Item.URI_PATH);
                }
                C19710I extended = item.getExtended();
                if (extended != null) {
                    AttributedText price = extended.getPrice();
                    List<C19703B> listB = extended.b();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listB, 10));
                    for (C19703B c19703b : listB) {
                        arrayList3.add(new UniversalImage(c19703b.getValue(), c19703b.getValueDark()));
                    }
                    List<ItemTextField> listD = extended.d();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = listD.iterator();
                    while (it2.hasNext()) {
                        ItemTextField itemTextField = (ItemTextField) it2.next();
                        int i12 = C11244a.f397022e[itemTextField.getType().ordinal()];
                        if (i12 == 1) {
                            it = it2;
                            image2 = imageBySizes;
                            str3 = uriPath;
                            String str4 = itemTextField.getType().f430805b;
                            AttributedText attributedText = itemTextField.getContent().getAttributedText();
                            if (attributedText == null) {
                                attributedText = new AttributedText("Ошибка", C42784z0.f406748b, 0, 4, null);
                            }
                            text = new MessageBody.SystemMessageBody.ExtendedTextFields.Text(str4, attributedText);
                        } else if (i12 == 2) {
                            C19711J content = itemTextField.getContent();
                            String distance = content.getDistance();
                            String distanceInTime = content.getDistanceInTime();
                            List<C19713L> listE = content.e();
                            if (listE != null) {
                                List<C19713L> list = listE;
                                it = it2;
                                image2 = imageBySizes;
                                str3 = uriPath;
                                ArrayList arrayList5 = new ArrayList(C42745f0.q(list, 10));
                                Iterator<T> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList5.add(new MessageBody.SystemMessageBody.ExtendedColor(((C19713L) it3.next()).getColor()));
                                }
                                arrayList = arrayList5;
                            } else {
                                it = it2;
                                image2 = imageBySizes;
                                str3 = uriPath;
                                arrayList = null;
                            }
                            text = new MessageBody.SystemMessageBody.ExtendedTextFields.Content(itemTextField.getType().f430805b, new MessageBody.SystemMessageBody.ExtendedContent(distance, distanceInTime, arrayList, content.getName(), content.getAddress()));
                        } else {
                            if (i12 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o("ApicoItemTextField.type");
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
                    C19708G actions = extended.getActions();
                    if (actions != null) {
                        CallbackItemAction callback = actions.getCallback();
                        x xVar = this.f397016a;
                        if (callback != null) {
                            String title2 = callback.getTitle();
                            CallbackItemAction.Style style = callback.getStyle();
                            extendedButton = new MessageBody.SystemMessageBody.ExtendedButton(title2, style != null ? style.f430778b : null, callback.getUri(), xVar.b(callback.getUri()));
                        } else {
                            extendedButton = null;
                        }
                        BaseItemAction message2 = actions.getMessage();
                        if (message2 != null) {
                            String title3 = message2.getTitle();
                            BaseItemAction.Style style2 = message2.getStyle();
                            if (style2 == null || (str2 = style2.f430759b) == null) {
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
                            extendedButton3 = new MessageBody.SystemMessageBody.ExtendedButton(title4, style3 != null ? style3.f430768b : null, call.getUri(), xVar.b(call.getUri()));
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
                V image4 = chunk.getImage();
                if (image4 == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.Image(image4.getImageId(), null);
                break;
            case 4:
                Y location = chunk.getLocation();
                if (location == null) {
                    throw a(chunk, message);
                }
                String title5 = location.getTitle();
                if (title5 == null) {
                    throw c(message, "title");
                }
                List<C19702A> listA = location.a();
                ArrayList arrayList6 = new ArrayList(C42745f0.q(listA, 10));
                for (C19702A c19702a : listA) {
                    String title6 = c19702a.getTitle();
                    List<Z> listA2 = c19702a.a();
                    if (listA2 != null) {
                        ArrayList arrayList7 = new ArrayList();
                        for (Z z12 : listA2) {
                            if (z12 == null || (attributedTextJ = z12.getAttributedText()) == null) {
                                attributedTextJ = (z12 == null || (text2 = z12.getText()) == null) ? null : j(text2, z12.b());
                            }
                            if (attributedTextJ != null) {
                                arrayList7.add(attributedTextJ);
                            }
                        }
                        arrayList2 = arrayList7;
                    } else {
                        arrayList2 = null;
                    }
                    arrayList6.add(new GeoMarker(c19702a.getLat(), c19702a.getLon(), title6, arrayList2));
                }
                GeoMarker[] geoMarkerArr = (GeoMarker[]) arrayList6.toArray(new GeoMarker[0]);
                c0 markersRequest2 = location.getMarkersRequest();
                if (markersRequest2 != null) {
                    String method = markersRequest2.getMethod();
                    Map<String, Object> mapB = markersRequest2.b();
                    markersRequest = new MarkersRequest(method, mapB != null ? new RawJson(this.f397017b.l(mapB)) : RawJson.INSTANCE.getEMPTY());
                }
                return new MessageBody.SystemMessageBody.Platform.Bubble.GeoLocation(title5, geoMarkerArr, markersRequest);
            case 5:
                U file = chunk.getFile();
                if (file == null) {
                    throw a(chunk, message);
                }
                image3 = new MessageBody.SystemMessageBody.Platform.Bubble.File(file.getFileId(), file.getName(), file.getSizeBytes());
                break;
            case 6:
                a0 video = chunk.getVideo();
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
    public final AttributedText j(@Y61.k String str, @Y61.l Map map) {
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
                    DeepLink deepLinkB = deepLink != null ? this.f397016a.b(deepLink) : null;
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
    public final ru.avito.messenger.api.entity.body.MessageBody l(@Y61.k C19719S c19719s, @Y61.k Message message) throws k {
        ru.avito.messenger.api.entity.body.MessageBody link;
        MessageBody.Link.Preview snippet;
        MessageBody.AppCall.Direction unsupported;
        MessageBody.AppCall.Status unsupported2;
        MessageBody.Link.Preview preview = null;
        preview = null;
        switch (C11244a.f397020c[message.getType().ordinal()]) {
            case 1:
                Z text = c19719s.getText();
                if (text != null) {
                    return (message.getDeletedAt() == null || message.getDeletedAt().longValue() <= 0) ? new Text(text.getText(), c19719s.getIdempotencyKey(), text.getHasTrustedUrls(), text.getAttributedText()) : new MessageBody.Deleted(text.getText(), c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 2:
                W item = c19719s.getItem();
                if (item != null) {
                    return new ItemReference(String.valueOf(item.getItemId()), c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 3:
                V image = c19719s.getImage();
                if (image != null) {
                    return new ImageReference(image.getImageId(), c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 4:
                T call = c19719s.getCall();
                if (call != null) {
                    return new CallReference(call.getTargetUserId(), c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 5:
                X link2 = c19719s.getLink();
                if (link2 == null) {
                    throw b(message);
                }
                String url = link2.getUrl();
                Preview preview2 = link2.getPreview();
                if (preview2 != null) {
                    Preview.Type type = preview2.getType();
                    int i12 = type == null ? -1 : C11244a.f397026i[type.ordinal()];
                    if (i12 == -1) {
                        throw c(message, "ApicoPreview.type");
                    }
                    if (i12 == 1) {
                        C19716O linkPreview = preview2.getLinkPreview();
                        if (linkPreview == null) {
                            throw c(message, "linkPreview");
                        }
                        snippet = new MessageBody.Link.Preview.Snippet(linkPreview.getUrl(), null, linkPreview.getDomain(), linkPreview.getTrusted(), linkPreview.getTitle(), linkPreview.getSubtitle(), linkPreview.getDescription(), linkPreview.getImageId(), null, null, null, null);
                    } else if (i12 == 2) {
                        C19704C imagePreview = preview2.getImagePreview();
                        if (imagePreview == null) {
                            throw c(message, "imagePreview");
                        }
                        snippet = new MessageBody.Link.Preview.Image(imagePreview.getUrl(), imagePreview.getDomain(), imagePreview.getTrusted(), imagePreview.getImageId(), null, null, null, null);
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o("ApicoPreview.type");
                    }
                    preview = snippet;
                }
                link = new MessageBody.Link(url, preview, c19719s.getIdempotencyKey(), link2.getIsTrusted());
                break;
            case 6:
                Y location = c19719s.getLocation();
                if (location == null) {
                    throw b(message);
                }
                C19702A c19702a = (C19702A) C42745f0.G(location.a());
                if (c19702a == null) {
                    throw c(message, "latitude");
                }
                double lat = c19702a.getLat();
                C19702A c19702a2 = (C19702A) C42745f0.G(location.a());
                if (c19702a2 == null) {
                    throw c(message, "longitude");
                }
                double lon = c19702a2.getLon();
                String title = location.getTitle();
                if (title == null) {
                    throw c(message, "title");
                }
                C19702A c19702a3 = (C19702A) C42745f0.G(location.a());
                link = new MessageBody.Location(lat, lon, title, c19702a3 != null ? c19702a3.getKind() : null, c19719s.getIdempotencyKey());
                break;
            case 7:
                MessageBodyAppCallNullable appCall = c19719s.getAppCall();
                if (appCall == null) {
                    throw b(message);
                }
                String text2 = appCall.getText();
                C19735p call2 = appCall.getCall();
                if (call2 == null) {
                    throw c(message, "call");
                }
                com.avito.android.remote.model.Action action = new com.avito.android.remote.model.Action(call2.getTitle(), this.f397016a.b(call2.getUri()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65532, null);
                String callId = appCall.getCallId();
                Long duration = appCall.getDuration();
                int i13 = C11244a.f397023f[appCall.getDirection().ordinal()];
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
                switch (C11244a.f397024g[appCall.getStatus().ordinal()]) {
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
                        o("ApicoAppCallStatus");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return new MessageBody.AppCall(text2, action, callId, duration, direction, unsupported2, appCall.getTitle(), appCall.getSubTitle(), appCall.getIsVideo(), c19719s.getIdempotencyKey());
            case 8:
                U file = c19719s.getFile();
                if (file != null) {
                    return new MessageBody.File(file.getFileId(), file.getName(), file.getSizeBytes(), null, c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 9:
                a0 video = c19719s.getVideo();
                if (video != null) {
                    return new MessageBody.Video(video.getFileId(), video.getVideoId(), c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 10:
                MessageBodyCompositeNullable composite = c19719s.getComposite();
                if (composite == null) {
                    throw b(message);
                }
                String text3 = composite.getText();
                try {
                    List<Chunk> listA = composite.a();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        arrayList.add(i((Chunk) it.next(), message));
                    }
                    MessageContextActionsNullable contextActions = message.getContextActions();
                    PlatformActions platformActionsH = contextActions != null ? h(contextActions, message) : null;
                    String flowName = composite.getFlowName();
                    C19706E inputState = message.getInputState();
                    return new MessageBody.SystemMessageBody.Platform.FromAvito(arrayList, platformActionsH, flowName, text3, inputState != null ? new InputState(inputState.getIsDisabled(), inputState.getReason(), inputState.getDescription()) : null);
                } catch (Throwable th2) {
                    V2.f318762a.a("GetChannelByIdApicoResponseConverter", "Failed to convert ApicoAvitoPlatformMessageBody", th2);
                    return !C43066x.K(text3) ? new MessageBody.SystemMessageBody.Platform.FromAvito(Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText(composite.getText(), C42784z0.f406748b, 0, 4, null))), null, null, null, null, 30, null) : new Unknown(MessageBody.SystemMessageBody.Platform.FromAvito.TYPE, c19719s.getIdempotencyKey());
                }
            case 11:
                MessageBodyCompositeNullable composite2 = c19719s.getComposite();
                if (composite2 == null) {
                    throw b(message);
                }
                String text4 = composite2.getText();
                try {
                    List<Chunk> listA2 = composite2.a();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(listA2, 10));
                    Iterator<T> it2 = listA2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(i((Chunk) it2.next(), message));
                    }
                    MessageContextActionsNullable contextActions2 = message.getContextActions();
                    PlatformActions platformActionsH2 = contextActions2 != null ? h(contextActions2, message) : null;
                    String flowName2 = composite2.getFlowName();
                    C19706E inputState2 = message.getInputState();
                    return new MessageBody.SystemMessageBody.Platform.FromUser(arrayList2, platformActionsH2, flowName2, text4, inputState2 != null ? new InputState(inputState2.getIsDisabled(), inputState2.getReason(), inputState2.getDescription()) : null);
                } catch (Throwable th3) {
                    V2.f318762a.a("GetChannelByIdApicoResponseConverter", "Failed to convert ApicoImpersonatedPlatformMessageBody", th3);
                    return !C43066x.K(text4) ? new MessageBody.SystemMessageBody.Platform.FromUser(Collections.singletonList(new MessageBody.SystemMessageBody.Platform.Bubble.Text(new AttributedText(composite2.getText(), C42784z0.f406748b, 0, 4, null))), null, null, null, null, 30, null) : new Unknown(MessageBody.SystemMessageBody.Platform.FromUser.TYPE, c19719s.getIdempotencyKey());
                }
            case 12:
                Z text5 = c19719s.getText();
                if (text5 != null) {
                    return new MessageBody.Text.Reaction(text5.getText(), null, c19719s.getIdempotencyKey(), text5.getAttributedText(), 2, null);
                }
                throw b(message);
            case 13:
                Z text6 = c19719s.getText();
                if (text6 != null) {
                    return new MessageBody.Deleted(text6.getText(), c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 14:
                b0 voice = c19719s.getVoice();
                if (voice != null) {
                    return new MessageBody.Voice(voice.getVoiceId(), c19719s.getIdempotencyKey());
                }
                throw b(message);
            case 15:
                o("ApicoMessage.type");
                return new Unknown("unknown_type", c19719s.getIdempotencyKey());
            default:
                throw new NoWhenBranchMatchedException();
        }
        return link;
    }

    @Y61.k
    public final ContextActionHandler.MethodCall n(@Y61.k c0 c0Var) {
        String method = c0Var.getMethod();
        Map<String, Object> mapB = c0Var.b();
        RawJson rawJson = mapB != null ? new RawJson(this.f397017b.l(mapB)) : null;
        i0 reaction = c0Var.getReaction();
        return new ContextActionHandler.MethodCall(method, rawJson, reaction != null ? new ContextActionHandler.MethodCall.Reaction(reaction.getText()) : null);
    }
}
