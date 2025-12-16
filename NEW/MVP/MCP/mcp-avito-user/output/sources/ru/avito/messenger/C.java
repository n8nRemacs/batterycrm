package ru.avito.messenger;

import a91.C19705D;
import a91.C19706E;
import a91.C19707F;
import a91.C19709H;
import a91.C19712K;
import a91.C19715N;
import a91.C19721b;
import a91.C19727h;
import a91.C19733n;
import a91.C19734o;
import a91.C19736q;
import a91.C19737r;
import a91.C19738s;
import a91.C19742w;
import a91.C19744y;
import a91.C19745z;
import a91.InterfaceC19740u;
import android.net.Uri;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.ChannelKt;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context.ChatReplyTime;
import com.avito.android.remote.model.messenger.context.HeaderButton;
import com.avito.android.remote.model.messenger.context.Placeholder;
import com.avito.android.remote.model.messenger.context_actions.ItemsRequest;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.header.HeaderTitleButton;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.AttributedText;
import h91.C40785a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import ru.avito.messenger.api.entity.Avatar;
import ru.avito.messenger.api.entity.ChannelInfo;
import ru.avito.messenger.api.entity.ChannelInfoDetails;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.InputState;
import ru.avito.messenger.api.entity.PublicProfile;
import ru.avito.messenger.api.entity.Quote;
import ru.avito.messenger.api.entity.ReadOnlyState;
import ru.avito.messenger.api.entity.body.MessageBody;
import ru.avito.messenger.api.entity.context.ChannelContext;
import ru.avito.messenger.generated.api.create_item_channel.Action;
import ru.avito.messenger.generated.api.create_item_channel.Channel;
import ru.avito.messenger.generated.api.create_item_channel.ChannelContextActionsNullable;
import ru.avito.messenger.generated.api.create_item_channel.DomainError;
import ru.avito.messenger.generated.api.create_item_channel.HeaderTitleButtonNullable;
import ru.avito.messenger.generated.api.create_item_channel.Message;
import ru.avito.messenger.generated.api.create_item_channel.QuoteNullable;
import ru.avito.messenger.internal.apico.MessengerApicoCreateChannelException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;

/* compiled from: MessengerClientFacade.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "La91/w;", "response", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/Channel;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f430601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f430602c;

    public C(D d12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f430601b = d12;
        this.f430602c = messengerUserHashInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Long, java.lang.String] */
    @Override // l41.o
    public final Object apply(Object obj) throws h91.k {
        C19742w c19742w;
        Object messengerApicoCreateChannelException;
        com.avito.android.arch.mvi.utils.c bVar;
        int i12;
        String str;
        C40785a c40785a;
        ?? r22;
        ChatMessage chatMessage;
        C42784z0 c42784z0;
        ChannelContext userToUser;
        HeaderTitleButton headerTitleButton;
        W81.a aVar;
        Float f12;
        SimpleAction simpleAction;
        W81.a actions;
        W81.a aVar2;
        ChatReplyTime chatReplyTime;
        Placeholder placeholder;
        HeaderButton headerButton;
        String rawDeeplink;
        Placeholder placeholder2;
        PublicProfile publicProfile;
        SimpleAction simpleAction2;
        Uri uri;
        Quote quote;
        Object next;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return io.reactivex.rxjava3.core.I.l(new MessengerApicoCreateChannelException(((TypedResult.Error) typedResult).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        C40785a c40785a2 = this.f430601b.f430610h.get();
        C19742w c19742w2 = (C19742w) ((TypedResult.Success) typedResult).getResult();
        String str2 = this.f430602c.f430682d;
        c40785a2.getClass();
        Channel channel = c19742w2.getChannel();
        ru.avito.messenger.api.entity.Channel channel2 = null;
        if (channel != null) {
            String id2 = channel.getId();
            int i13 = C40785a.C11244a.f397019b[channel.getType().ordinal()];
            if (i13 == 1) {
                str = "a2u";
            } else if (i13 == 2) {
                str = "u2i";
            } else if (i13 == 3) {
                str = "u2u";
            } else if (i13 == 4) {
                str = ChannelKt.MULTI_CHAT_TYPE;
            } else {
                if (i13 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                C40785a.o("ApicoChannel.type");
                str = "unknown_type";
            }
            String str3 = str;
            Message lastMessage = channel.getLastMessage();
            if (lastMessage != null) {
                String id3 = lastMessage.getId();
                String channelId = lastMessage.getChannelId();
                MessageBody messageBodyL = c40785a2.l(lastMessage.getBody(), lastMessage);
                String authorId = lastMessage.getAuthorId();
                long j12 = 100;
                long createdAt = lastMessage.getCreatedAt() / j12;
                boolean z12 = lastMessage.getReadAt() != null && lastMessage.getReadAt().longValue() > 0;
                Long readAt = lastMessage.getReadAt();
                Long lValueOf = readAt != null ? Long.valueOf(readAt.longValue() / j12) : null;
                c19742w = c19742w2;
                ChatMessage.PartialChannel partialChannel = new ChatMessage.PartialChannel(lastMessage.getUpdatedAt() / j12, null);
                a91.f0 preview = lastMessage.getPreview();
                ChatMessage.Preview preview2 = preview != null ? new ChatMessage.Preview(preview.getText()) : null;
                a91.e0 platformSupport = lastMessage.getPlatformSupport();
                PlatformSupport platformSupportD = platformSupport != null ? c40785a2.d(platformSupport) : null;
                QuoteNullable quote2 = lastMessage.getQuote();
                if (quote2 != null) {
                    Iterator it = ((AbstractC42738c) Message.Type.f430813d).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((Message.Type) next).f430814b == quote2.getType().f430835b) {
                            break;
                        }
                    }
                    Message.Type type = (Message.Type) next;
                    if (type == null) {
                        throw new h91.k("Unknown quote type: " + quote2.getType().f430835b);
                    }
                    quote = new Quote(quote2.getId(), c40785a2.l(quote2.getBody(), new Message(quote2.getAuthorId(), quote2.getBody(), "", null, quote2.getCreatedAt() / j12, null, quote2.getId(), null, false, null, null, null, null, null, type, 0L)), quote2.getCreatedAt() / j12, quote2.getAuthorId(), Integer.valueOf((int) quote2.getChunkIndex()));
                } else {
                    quote = null;
                }
                boolean z13 = z12;
                c40785a = c40785a2;
                r22 = 0;
                chatMessage = new ChatMessage(id3, str2, channelId, messageBodyL, authorId, createdAt, z13, lValueOf, partialChannel, preview2, platformSupportD, quote, null);
            } else {
                c19742w = c19742w2;
                c40785a = c40785a2;
                r22 = 0;
                chatMessage = null;
            }
            List<a91.q0> listO = channel.o();
            if (listO != null) {
                List<a91.q0> list = listO;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (a91.q0 q0Var : list) {
                    String id4 = q0Var.getId();
                    String name = q0Var.getName();
                    Long lastActionTime = q0Var.getLastActionTime();
                    a91.g0 publicUserProfile = q0Var.getPublicUserProfile();
                    if (publicUserProfile != null) {
                        C19733n avatar = publicUserProfile.getAvatar();
                        Avatar avatar2 = new Avatar(avatar.getDefault(), C40785a.k(avatar.getImages()));
                        C19744y deeplink = publicUserProfile.getDeeplink();
                        if (deeplink != null) {
                            String title = deeplink.getTitle();
                            String rawDeeplink2 = deeplink.getRawDeeplink();
                            if (rawDeeplink2 == null || (uri = Uri.parse(rawDeeplink2)) == null) {
                                uri = new NoMatchLink().getUri();
                            }
                            simpleAction2 = new SimpleAction(title, r22, uri, r22);
                        } else {
                            simpleAction2 = r22;
                        }
                        publicProfile = new PublicProfile(avatar2, simpleAction2);
                    } else {
                        publicProfile = r22;
                    }
                    arrayList.add(new ChannelUser(id4, name, lastActionTime, publicProfile, q0Var.getTimeDiff(), q0Var.getLabel()));
                }
                c42784z0 = arrayList;
            } else {
                c42784z0 = C42784z0.f406748b;
            }
            long j13 = 100;
            long created = channel.getCreated() / j13;
            long sortingTimestamp = channel.getSortingTimestamp() / j13;
            InterfaceC19740u context = channel.getContext();
            if (context instanceof InterfaceC19740u.a) {
                C19709H value = ((InterfaceC19740u.a) context).getValue();
                C19707F item = value.getItem();
                String strValueOf = String.valueOf(item.getId());
                String strValueOf2 = String.valueOf(item.getCategoryId());
                String title2 = item.getTitle();
                String priceString = item.getPriceString();
                if (priceString == null) {
                    priceString = "";
                }
                String str4 = priceString;
                C19705D images = item.getImages();
                Image main = images != null ? images.getMain() : r22;
                boolean deleted = item.getDeleted();
                String userId = value.getUserId();
                List listM = C40785a.m(value.e());
                C19727h attachMenu = value.getAttachMenu();
                AttachMenu attachMenuE = attachMenu != null ? C40785a.e(attachMenu) : r22;
                a91.l0 sharedLocation = item.getSharedLocation();
                MessageBody.Location location = sharedLocation != null ? new MessageBody.Location(sharedLocation.getLat(), sharedLocation.getLon(), sharedLocation.getTitle(), null, null, 24, null) : r22;
                a91.k0 replyTime = value.getReplyTime();
                if (replyTime != null) {
                    String type2 = replyTime.getType();
                    ChatReplyTime.ActionType actionType = ChatReplyTime.ActionType.CALL;
                    if (!kotlin.jvm.internal.L.f(type2, actionType.getKey())) {
                        actionType = ChatReplyTime.ActionType.DEFAULT;
                    }
                    chatReplyTime = new ChatReplyTime(actionType, replyTime.getText(), r22);
                } else {
                    chatReplyTime = r22;
                }
                String assistantReplyTimePlaceholder = value.getAssistantReplyTimePlaceholder();
                boolean hidePhone = item.getHidePhone();
                a91.d0 placeholder3 = value.getPlaceholder();
                if (placeholder3 != null) {
                    a91.n0 image = placeholder3.getImage();
                    Placeholder.Image.Size size = new Placeholder.Image.Size((int) image.getSize().getWidth(), (int) image.getSize().getHeight());
                    Set<Map.Entry<Size, Uri>> setEntrySet = image.getUrls().getVariants().entrySet();
                    int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
                    if (iF2 < 16) {
                        iF2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                    Iterator<T> it2 = setEntrySet.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        Size size2 = (Size) entry.getKey();
                        Uri uri2 = (Uri) entry.getValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(size2.getWidth());
                        sb2.append('x');
                        sb2.append(size2.getHeight());
                        linkedHashMap.put(sb2.toString(), uri2.toString());
                    }
                    Placeholder.Image image2 = new Placeholder.Image(linkedHashMap, size);
                    AttributedText description = placeholder3.getDescription();
                    if (description == null) {
                        placeholder2 = null;
                    } else {
                        C19734o button = placeholder3.getButton();
                        placeholder2 = new Placeholder(image2, description, button != null ? new Placeholder.Button(button.getTitle(), button.getStyle(), button.getTheme(), button.getOnTapDeepLink()) : null);
                    }
                    placeholder = placeholder2;
                } else {
                    placeholder = null;
                }
                C19736q headerItemButton = value.getHeaderItemButton();
                if (headerItemButton != null) {
                    String title3 = headerItemButton.getTitle();
                    headerButton = (title3 == null || (rawDeeplink = headerItemButton.getRawDeeplink()) == null) ? null : new HeaderButton(title3, rawDeeplink);
                } else {
                    headerButton = null;
                }
                userToUser = new ChannelContext.Item(strValueOf, strValueOf2, "", title2, str4, main, deleted, userId, listM, attachMenuE, location, chatReplyTime, assistantReplyTimePlaceholder, hidePhone, placeholder, headerButton);
            } else if (context instanceof InterfaceC19740u.b) {
                a91.h0 value2 = ((InterfaceC19740u.b) context).getValue();
                a91.m0 sharedLocation2 = value2.getSharedLocation();
                MessageBody.Location location2 = sharedLocation2 != null ? new MessageBody.Location(sharedLocation2.getLat(), sharedLocation2.getLon(), sharedLocation2.getTitle(), null, null, 24, null) : null;
                List listM2 = C40785a.m(value2.c());
                C19727h attachMenu2 = value2.getAttachMenu();
                userToUser = new ChannelContext.ReDeal(location2, listM2, attachMenu2 != null ? C40785a.e(attachMenu2) : null, value2.getAvatarUserId());
            } else if (context instanceof InterfaceC19740u.c) {
                a91.p0 value3 = ((InterfaceC19740u.c) context).getValue();
                String name2 = value3.getName();
                String description2 = value3.getDescription();
                Image image3 = value3.getImage();
                List listM3 = C40785a.m(value3.e());
                C19727h attachMenu3 = value3.getAttachMenu();
                AttachMenu attachMenuE2 = attachMenu3 != null ? C40785a.e(attachMenu3) : null;
                HeaderTitleButtonNullable headerTitleButton2 = value3.getHeaderTitleButton();
                if (headerTitleButton2 != null) {
                    HeaderTitleButtonNullable.IconMobileNullable iconMobileNullable = headerTitleButton2.getIconMobileNullable();
                    String str5 = iconMobileNullable != null ? iconMobileNullable.f430797b : null;
                    HeaderTitleButtonNullable.IconWebNullable iconWebNullable = headerTitleButton2.getIconWebNullable();
                    headerTitleButton = new HeaderTitleButton(str5, iconWebNullable != null ? iconWebNullable.f430800b : null, headerTitleButton2.getDeeplink());
                } else {
                    headerTitleButton = null;
                }
                userToUser = new ChannelContext.System(name2, null, description2, image3, listM3, attachMenuE2, headerTitleButton);
            } else {
                if (!(context instanceof InterfaceC19740u.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                a91.r0 value4 = ((InterfaceC19740u.d) context).getValue();
                a91.m0 sharedLocation3 = value4.getSharedLocation();
                MessageBody.Location location3 = sharedLocation3 != null ? new MessageBody.Location(sharedLocation3.getLat(), sharedLocation3.getLon(), sharedLocation3.getTitle(), null, null, 24, null) : null;
                List listM4 = C40785a.m(value4.b());
                C19727h attachMenu4 = value4.getAttachMenu();
                userToUser = new ChannelContext.UserToUser(location3, listM4, attachMenu4 != null ? C40785a.e(attachMenu4) : null);
            }
            a91.j0 readOnly = channel.getReadOnly();
            ReadOnlyState readOnlyState = readOnly != null ? new ReadOnlyState(readOnly.getReason(), readOnly.getDescription()) : null;
            Boolean boolValueOf = Boolean.valueOf(channel.getIsRead());
            Boolean boolValueOf2 = Boolean.valueOf(channel.getIsAnswered());
            List<Long> listM5 = channel.m();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listM5, 10));
            Iterator<T> it3 = listM5.iterator();
            while (it3.hasNext()) {
                long jLongValue = ((Number) it3.next()).longValue();
                arrayList2.add(jLongValue == 1 ? "f_i" : jLongValue == 2 ? "s" : jLongValue == 3 ? "p" : jLongValue == 7 ? "asd" : jLongValue == 8 ? "transaction" : jLongValue == 10 ? "j_l" : jLongValue == 11 ? "j_n" : jLongValue == 12 ? "j_t" : jLongValue == 13 ? "j_i" : jLongValue == 16 ? "imp" : String.valueOf(jLongValue));
            }
            ChannelContextActionsNullable contextActions = channel.getContextActions();
            if (contextActions != null) {
                Long lValueOf2 = Long.valueOf(channel.getVersion());
                int i14 = C40785a.C11244a.f397029l[contextActions.getType().ordinal()];
                if (i14 == 1) {
                    C40785a c40785a3 = c40785a;
                    C19721b actions2 = contextActions.getActions();
                    if (actions2 == null) {
                        aVar2 = null;
                        aVar = aVar2;
                    } else {
                        String title4 = actions2.getTitle();
                        List<Action> listA = actions2.a();
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(listA, 10));
                        Iterator<T> it4 = listA.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(c40785a3.f((Action) it4.next()));
                        }
                        String messageId = contextActions.getMessageId();
                        a91.e0 platformSupport2 = contextActions.getPlatformSupport();
                        PlatformSupport platformSupportD2 = platformSupport2 != null ? c40785a3.d(platformSupport2) : null;
                        C19745z expandable = actions2.getExpandable();
                        PlatformActions.ExpandableData expandableDataG = expandable != null ? c40785a3.g(expandable) : null;
                        Boolean hideKeyboard = actions2.getHideKeyboard();
                        actions = new PlatformActions.Actions(title4, arrayList3, messageId, platformSupportD2, lValueOf2, expandableDataG, hideKeyboard != null ? hideKeyboard.booleanValue() : false, kotlin.jvm.internal.L.f(actions2.getUseMultiButtons(), Boolean.TRUE) ? PlatformActions.MultiButtonsData.INSTANCE : null);
                    }
                } else if (i14 == 2) {
                    C19712K itemsList = contextActions.getItemsList();
                    if (itemsList == null) {
                        throw new h91.k("Empty itemsList for messageId = " + contextActions.getMessageId());
                    }
                    C19745z expandable2 = itemsList.getExpandable();
                    C40785a c40785a4 = c40785a;
                    if ((expandable2 != null ? c40785a4.g(expandable2) : null) != null) {
                        String title5 = itemsList.getTitle();
                        a91.c0 itemsRequest = itemsList.getItemsRequest();
                        if (itemsRequest == null) {
                            throw new h91.k("itemsRequest is null for ItemsList");
                        }
                        String method = itemsRequest.getMethod();
                        Map<String, Object> mapB = itemsRequest.b();
                        ItemsRequest itemsRequest2 = new ItemsRequest(method, mapB != null ? new RawJson(c40785a4.f397017b.l(mapB)) : null);
                        String messageId2 = contextActions.getMessageId();
                        a91.e0 platformSupport3 = contextActions.getPlatformSupport();
                        PlatformSupport platformSupportD3 = platformSupport3 != null ? c40785a4.d(platformSupport3) : null;
                        PlatformActions.ExpandableData expandableDataG2 = c40785a4.g(itemsList.getExpandable());
                        Boolean hideKeyboard2 = itemsList.getHideKeyboard();
                        actions = new PlatformActions.ItemsList(title5, itemsRequest2, messageId2, platformSupportD3, lValueOf2, expandableDataG2, hideKeyboard2 != null ? hideKeyboard2.booleanValue() : false);
                    } else {
                        actions = new PlatformActions.None(lValueOf2);
                    }
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C40785a.o("ApicoChannelContextActions.type");
                    actions = new PlatformActions.None(lValueOf2);
                }
                aVar2 = actions;
                aVar = aVar2;
            } else {
                aVar = null;
            }
            String flow = channel.getFlow();
            String suspectMessageId = channel.getSuspectMessageId();
            C19737r info = channel.getInfo();
            String name3 = info.getName();
            ru.avito.messenger.api.entity.Image imageK = C40785a.k(info.getAvatar());
            C19715N link = info.getLink();
            if (link != null) {
                f12 = null;
                simpleAction = new SimpleAction(link.getTitle(), null, Uri.parse(link.getUri()), null);
            } else {
                f12 = null;
                simpleAction = null;
            }
            String userId2 = info.getUserId();
            String description3 = info.getDescription();
            Double rating = info.getRating();
            Float fValueOf = rating != null ? Float.valueOf((float) rating.doubleValue()) : f12;
            C19738s details = info.getDetails();
            ChannelInfo channelInfo = new ChannelInfo(name3, imageK, simpleAction, null, userId2, description3, fValueOf, details != null ? new ChannelInfoDetails(details.getTitle(), details.getText()) : f12);
            C19706E inputState = channel.getInputState();
            channel2 = new ru.avito.messenger.api.entity.Channel(id2, str3, chatMessage, c42784z0, created, sortingTimestamp, userToUser, readOnlyState, null, boolValueOf, null, boolValueOf2, arrayList2, aVar, flow, suspectMessageId, channelInfo, inputState != null ? new InputState(inputState.getIsDisabled(), inputState.getReason(), inputState.getDescription()) : f12, channel.getPinOrder());
        } else {
            c19742w = c19742w2;
        }
        if (channel2 != null) {
            bVar = new c.C2712c(channel2);
        } else {
            DomainError error = c19742w.getError();
            if (error != null) {
                switch (C40785a.C11244a.f397018a[error.getCode().ordinal()]) {
                    case 1:
                        i12 = -32600;
                        break;
                    case 2:
                        i12 = -32043;
                        break;
                    case 3:
                        i12 = -32044;
                        break;
                    case 4:
                        i12 = -32060;
                        break;
                    case 5:
                        i12 = -32042;
                        break;
                    case 6:
                        i12 = -32045;
                        break;
                    case 7:
                        i12 = -32046;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                messengerApicoCreateChannelException = new MessengerJsonRpcCallException(i12, error.getMessage(), null, null, null, null, 60, null);
            } else {
                messengerApicoCreateChannelException = new MessengerApicoCreateChannelException(new ApiError.UnknownError("Empty (null) channel in response", null, null, 6, null));
            }
            bVar = new c.b(messengerApicoCreateChannelException);
        }
        if (bVar instanceof c.C2712c) {
            return io.reactivex.rxjava3.core.I.q((ru.avito.messenger.api.entity.Channel) ((c.C2712c) bVar).f92028b);
        }
        if (bVar instanceof c.b) {
            return io.reactivex.rxjava3.core.I.l((Throwable) ((c.b) bVar).f92027b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
